package Lab5.Ex1;

public class Square extends Rectangle {
    Square() {};

    public Square(double side) { super(side, side);}

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() { return getWidth(); }

    public void setSide(double side) { super.setWidth(side); }

    public void setWidth(double width) { this.width = width; }

    public void setLength(double length) { this.length = length; }

    @Override
    public String toString() {
        return "Square with " +
                "width of: " + width +
                ", length of: " + length +
                ", color: '" + color + '\'' +
                ", filled: " + filled;
    }
}
