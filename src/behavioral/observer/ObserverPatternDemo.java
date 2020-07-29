package behavioral.observer;

/**
 * 观察者模式
 */
public class ObserverPatternDemo {

    public static void main(String agrs[]){
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexObserver(subject);
        System.out.println("first state change: 15");
        subject.setState(15);
        System.out.println("second state change: 10");
        subject.setState(10);
    }
}
