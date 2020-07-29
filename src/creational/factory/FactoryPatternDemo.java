package creational.factory;

/**
 * 工厂模式
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        shapeFactory factory = new shapeFactory();

        shape shape1 = factory.getShape("circle");
        shape1.draw();

        shape shape2 = factory.getShape("rectangle");
        shape2.draw();

        shape shape3 = factory.getShape("square");
        shape3.draw();
    }
}
