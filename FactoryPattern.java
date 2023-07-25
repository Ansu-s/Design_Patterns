package designPattens;

public class FactoryPattern {
    // Interface representing a shape
    interface Shape {
        void draw();
    }

    // Concrete implementation of Shape - Circle
    static class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a Circle.");
        }
    }

    // Concrete implementation of Shape - Square
    static class Square implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a Square.");
        }
    }

    // Concrete implementation of Shape - Triangle
    static class Triangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a Triangle.");
        }
    }

    // shapeFactory is the factory design patten
    class ShapeFactory {
        public static Shape createShape(String type) {
            if ("Circle".equalsIgnoreCase(type)) {
                return new Circle();
            } else if ("Square".equalsIgnoreCase(type)) {
                return new Square();
            } else if ("Triangle".equalsIgnoreCase(type)) {
                return new Triangle();
            } else {
                throw new IllegalArgumentException("Invalid shape type.");
            }
        }
    }
}


