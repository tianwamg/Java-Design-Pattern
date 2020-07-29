package creational.abstractfactory;

public class shapefactory extends abstractfactory {
    @Override
    public color getColor(String color) {
        return null;
    }

    @Override
    public shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new rectangel();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new square();
        }
        return null;
    }
}
