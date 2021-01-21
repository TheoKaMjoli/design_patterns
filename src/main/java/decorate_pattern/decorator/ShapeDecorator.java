package decorate_pattern.decorator;

import decorate_pattern.shapes.Shape;

/* We will then create an abstract decorator class ShapeDecorator implementing
    the Shape interface and having Shape object as its instance variable.*/
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }
    public void draw(){
        decoratedShape.draw();
    }
}
