package pl.edu.wszib.jwd;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int length, int height) {
        this.base = length;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height)/2;
    }

}
