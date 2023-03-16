package Lab5.Ex1;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle() {};

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() { return getWidth() * getLength(); }

    public double getPerimeter() { return 2 * (getLength() + getWidth()); }

    @Override
    public String toString() {
        return "Rectangle with the " +
                "width of: " + width +
                ", length of: " + length +
                ", color: '" + color + '\'' +
                ", filled: " + filled;
    }
}
