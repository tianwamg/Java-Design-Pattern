package behavioral.Mediator;

/**
 * 中介模式
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("aaa");
        User john = new User("bbb");

        robert.sendMessage("Hi! bbb!");
        john.sendMessage("Hello! aaa!");
    }
}
