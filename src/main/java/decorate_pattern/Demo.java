package decorate_pattern;

import decorate_pattern.decorator.RedShapeDec;
import decorate_pattern.shapes.Circle;
import decorate_pattern.shapes.Rectangle;
import decorate_pattern.shapes.Shape;

public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDec(new Circle());

        Shape redRectangle = new RedShapeDec(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle with red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

    }
}
