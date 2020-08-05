package creational.Multiton;

import java.util.Enumeration;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

/**
 * 对象池
 * 参考地址(https://www.jianshu.com/p/38c5bccf892f)
 * @param <T>
 */
public abstract class ObjectPool<T> {

    public static int numObject=10;//对象池大小
    public static int maxObject = 50;//对象池最大值

    public Vector<PooledObject<T>> objects = null;//存放对象池中对象的向量

    public ObjectPool(){

    }

    //创建对象池
    public synchronized void createPool(){
        if(objects != null){//确保对象池未被创建
            return;
        }
        objects = new Vector<>();
        for(int i=0;i<numObject;i++){
            objects.addElement(create());
        }
    }

    public abstract PooledObject<T> create();

    public synchronized T getObject(){
        //确保对象池已经被创建
        if(objects == null){
            return null;
        }
        T t = getFreeObject();//获取可用对象
        while (t== null){
            wait(250);
            t = getFreeObject();//重试
        }
        return t;

    }

    private T getFreeObject(){
        //从对象池中获取可用对象
        T obj = findFreeObject();
        if(obj == null){
            createObject(10);//如果对象池中没有可用对象,则创建可用对象
            obj = findFreeObject();
            if(obj == null){
                return null;
            }
        }
        return obj;
    }
    //从对象池中获取可用对象
    private T findFreeObject(){
        T obj = null;
        PooledObject<T> pObj = null;
        //获取对象池中所有的向量
        Enumeration<PooledObject<T>> enumerate = objects.elements();
        while (enumerate.hasMoreElements()){
            pObj = enumerate.nextElement();
            //如果对象不忙，则设置为忙
            if(!pObj.isBusy()){
                obj = pObj.getObject();
                pObj.setBusy(true);
            }
        }
        return obj;
    }

    //将对象返回对象池，并设置为闲置状态
    public void returnObject(T obj){
        //确保对象池存在，如果对象池没有，则直接返回
        if(objects == null){
            return;
        }
        PooledObject<T> pObj = null;
        Enumeration<PooledObject<T>> enumeration = objects.elements();
        while (enumeration.hasMoreElements()){
            pObj = (PooledObject<T>) enumeration.nextElement();
            //找到需要返回的对象
            if(obj == pObj){
                pObj.setBusy(false);
                break;
            }
        }
    }

    //关闭对象池中的所有对象，并清空对象池
    public synchronized void closeObjectPool(){
        if(objects == null){
            return;
        }
        PooledObject<T> pObj = null;
        Enumeration<PooledObject<T>> enumeration = objects.elements();
        while (enumeration.hasMoreElements()){
            pObj = (PooledObject<T>) enumeration.nextElement();
            if(pObj.isBusy()){
                wait(500);
            }
            //对象池中删除
            objects.removeElement(pObj);
        }
        //设置对象为空
        objects = null;
    }

    private void createObject(int increments){
        for(int i=0;i<increments;i++){
            if(objects.size() > maxObject){
                return;
            }
            objects.addElement(create());
        }
    }
    private void wait(int mSecond){
        try {
            TimeUnit.MILLISECONDS.sleep(mSecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
