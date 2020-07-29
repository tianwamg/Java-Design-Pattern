package creational.singleton;

/**
 * 静态内部类单例
 */
public class InnerSingleton {

    private static class SingletonHolder{
        private final static InnerSingleton instance = new InnerSingleton();
    }

    private InnerSingleton(){

    }

    public static InnerSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
