package Lab5.Ex1;

public class Circle extends Shape {
    protected double radius;

    Circle() {};

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() { return Math.round(Math.PI * radius); }

    @Override
    public double getPerimeter() { return Math.round(2 * Math.PI * radius); }

    @Override
    public String toString() {
        return "Circle with " +
                "radius of: " + radius +
                ", color: '" + color + '\'' +
                ", filled: " + filled;
    }
}
