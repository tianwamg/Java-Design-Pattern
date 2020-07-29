package structural.bridge;

/**
 * 桥接模式
 */
public class BridgeDemo {

    public static void main(String args[]){
        Shape redCircle = new Circle(100,10,10,new RedCircle());
        Shape greenCircle = new Circle(100,100,10,new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
