package Lab5.Ex1;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 3);
        Rectangle r2 = new Rectangle("green", false, 3, 4);

        System.out.println(r1.getWidth());
        System.out.println(r1.getLength());
        System.out.println(r2.getWidth());
        System.out.println(r2.getLength());
        System.out.println("\n");

        r1.setLength(1); r1.setWidth(2);
        r1.setLength(3); r2.setLength(6);

        System.out.println("The new width is: " + r1.getWidth());
        System.out.println("The new length is: " + r1.getLength());
        System.out.println("The new width is: " + r2.getWidth());
        System.out.println("The new length is: " + r2.getLength());

        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println("\n");

        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
        System.out.println("\n");

        System.out.println(r1);
        System.out.println(r2);
    }
}
