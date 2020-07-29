package creational.singleton;

/**
 * 懒汉式
 */
public class lazySingleton {

    private static lazySingleton instance;

    private lazySingleton(){

    }

    public static lazySingleton getInstance(){
        if(instance == null){
            instance = new lazySingleton();
        }
        return instance;
    }

    /**
     * 线程安全
     * @return
     */
    public static synchronized lazySingleton getInstance2(){
        if(instance == null){
            instance = new lazySingleton();
        }
        return instance;
    }
}
