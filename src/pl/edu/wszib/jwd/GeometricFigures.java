package pl.edu.wszib.jwd;

public class GeometricFigures {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,5);
        Triangle triangle = new Triangle(4,2);
        //Shape shape = new Shape();

        showArea(rectangle);
        showArea(triangle);

        Shape[] shapes = {rectangle, triangle};

    }
    public static void showArea(Shape shape) {
        System.out.println("Pole powierzchni: " + shape.getArea());
    }
}
