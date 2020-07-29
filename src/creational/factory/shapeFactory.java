package creational.factory;

public class shapeFactory {

    public shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("circle")){
            return  new Circle();
        }else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }
}
