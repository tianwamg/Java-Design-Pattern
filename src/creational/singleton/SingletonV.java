package creational.singleton;

/**
 * 双重校验锁单例
 */
public class SingletonV {

    private static volatile SingletonV instance;

    private SingletonV(){

    }

    public static SingletonV getInstance(){
        if(instance == null){
            synchronized (SingletonV.class){
                if(instance == null){
                    instance = new SingletonV();
                }
            }
        }
        return instance;
    }
}
