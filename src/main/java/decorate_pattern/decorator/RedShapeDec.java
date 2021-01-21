package decorate_pattern.decorator;
import decorate_pattern.shapes.Shape;
public class RedShapeDec extends ShapeDecorator {
    public RedShapeDec(Shape decoratedShape) {
        super(decoratedShape);
    }
    @Override
    public void draw(){
        decoratedShape.draw();
    }
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
