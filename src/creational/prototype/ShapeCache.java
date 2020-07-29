package creational.prototype;

import java.util.HashMap;

public class ShapeCache {

    private static HashMap<String,Shape> map = new HashMap<>();

    public static Shape getShape(String shapeId){
        Shape shape = map.get(shapeId);
        return (Shape) shape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        map.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        map.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        map.put(rectangle.getId(),rectangle);
    }
}
