package creational.builder;

public class vegBurger extends burger {
    @Override
    public String name() {
        return "veg burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
