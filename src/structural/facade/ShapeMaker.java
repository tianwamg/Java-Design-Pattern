package structural.facade;


public class ShapeMaker {

    private Circle circle;

    private Rectangle rectangle;

    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }
}
