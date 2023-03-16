package Lab5.Ex1;

public class TestCircle {
    public static void main(String[] args) {
        // Shape s1 = new Shape();
        Circle c1 = new Circle();
        Circle c2 = new Circle(2);
        Circle c3 = new Circle("red", true, 3);

        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());
        System.out.println(c3.getRadius());

        c1.setRadius(1);
        c1.setRadius(5);
        c1.setRadius(6);

        System.out.println("The new radius: " + c1.getRadius());
        System.out.println("The new radius: " + c2.getRadius());
        System.out.println("The new radius: " + c3.getRadius());
        System.out.println("\n");

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println(c3.getArea());
        System.out.println("\n");

        System.out.println(c1.getPerimeter());
        System.out.println(c2.getPerimeter());
        System.out.println(c3.getPerimeter());
        System.out.println("\n");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
