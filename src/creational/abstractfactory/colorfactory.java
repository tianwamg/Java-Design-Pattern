package creational.abstractfactory;

public class colorfactory extends abstractfactory {
    @Override
    public color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new blue();
        }
        return null;
    }

    @Override
    public shape getShape(String shape) {
        return null;
    }
}
