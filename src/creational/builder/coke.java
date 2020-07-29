package creational.builder;

public class coke extends coldDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 10.5f;
    }
}
