package creational.singleton;

/**
 * 饿汉式单例
 */
public class hungrySingleton {

    private static hungrySingleton singleton = new hungrySingleton();

    private hungrySingleton(){

    }

    public static hungrySingleton getInstance(){
        return singleton;
    }
}
