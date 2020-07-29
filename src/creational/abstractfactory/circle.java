package creational.abstractfactory;

public class circle implements shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
