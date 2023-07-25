package designPattens;

public class FactoryPatternExample extends FactoryPattern {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.createShape("Circle");
        Shape shape2 = ShapeFactory.createShape("Square");
        Shape shape3 = ShapeFactory.createShape("Triangle");

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
