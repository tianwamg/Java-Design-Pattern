package structural.decorator;

/**
 * 装饰器模式
 */
public class decoratorDemo {

    public static void main(String[] args) {
        shape circle = new circle();
        shapeDecorator redCircle = new redShapeDecorator(new circle());
        shapeDecorator redRectangle = new redShapeDecorator(new rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
