package creational.builder;

public class chickenBurger extends burger {
    @Override
    public String name() {
        return "chicken burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
