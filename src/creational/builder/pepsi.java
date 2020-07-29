package creational.builder;

public class pepsi extends coldDrink {
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 8.5f;
    }
}
