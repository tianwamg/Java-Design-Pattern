package creational.abstractfactory;

public class factoryProducer {

    public static abstractfactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new shapefactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new colorfactory();
        }
        return null;
    }

}
