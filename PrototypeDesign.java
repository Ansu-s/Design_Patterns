package designPattens;

public class PrototypeDesign {
    // Prototype interface
    interface Prototype {
        Prototype clone();
    }


    static class Rectangle implements Prototype {
        private int width;
        private int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public Prototype clone() {
            return new Rectangle(this.width, this.height);
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public void draw() {
            System.out.println("Drawing a rectangle with width: " + width + ", height: " + height);
        }
    }

    // Client code

        public static void main(String[] args) {

            Rectangle prototypeRectangle = new Rectangle(10, 5);


            Rectangle newRectangle = (Rectangle) prototypeRectangle.clone();
            newRectangle.draw();

            newRectangle.setWidth(7);
            newRectangle.draw();


            Rectangle anotherRectangle = (Rectangle) prototypeRectangle.clone();
            anotherRectangle.draw();
        }
    }

