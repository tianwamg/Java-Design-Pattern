package creational.builder;

public abstract class burger implements item {



    @Override
    public packing packi() {
        return new wrapper();
    }

    @Override
    public abstract float price();
}
