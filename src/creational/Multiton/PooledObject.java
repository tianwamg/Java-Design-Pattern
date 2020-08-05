package creational.Multiton;

public class PooledObject<T> {

    private T object = null;//外部使用的对象
    private boolean busy = false;//对象是否正在被使用

    //构造函数，池化对象
    public PooledObject(T object){
        this.object = object;
    }

    //返回对象
    public T getObject(){
        return object;
    }

    public void setObject(T object){
        this.object = object;
    }

    public boolean isBusy(){
        return busy;
    }

    public void setBusy(boolean busy){
        this.busy = busy;
    }
}
