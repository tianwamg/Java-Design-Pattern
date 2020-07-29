package creational.builder;

public abstract class coldDrink implements item{

    @Override
    public packing packi() {
        return new bottle();
    }

    @Override
    public abstract float price();
}
