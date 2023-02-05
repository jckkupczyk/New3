package interfaces;

public class Polymorphism {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Triangle();
        shapes[2] = new Rectangle();

        for (Shape shape : shapes) {
            shape.draw();
        }

//        Shape shape = new Shape();
//        shape.draw();
//
//        Rectangle rectangle = new Rectangle();
//        rectangle.draw();
//
//        System.out.println(rectangle instanceof Shape);
//
//        shape = new Rectangle();
//        shape.draw();
//
//        shape = new Circle();
//        shape.draw();
//
//        shape = new Triangle();
//        shape.draw();
    }
}
