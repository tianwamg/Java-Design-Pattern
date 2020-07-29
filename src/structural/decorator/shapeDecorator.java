package structural.decorator;

public abstract class shapeDecorator implements shape {

    protected shape decoratorShape;

    public shapeDecorator(shape decoratorShape){
        this.decoratorShape = decoratorShape;
    }

    public void draw(){
        decoratorShape.draw();
    }
}
