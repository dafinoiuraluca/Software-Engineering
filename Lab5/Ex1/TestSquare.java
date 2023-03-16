package Lab5.Ex1;

public class TestSquare {
    public static void main(String[] args) {
        Square s1 = new Square();
        Square s2 = new Square(2);
        Square s3 = new Square("yellow", true, 4);

        System.out.println(s1.getSide());
        System.out.println(s2.getSide());
        System.out.println(s3.getSide());
        System.out.println("\n");

        s1.setSide(1);
        s2.setSide(1);
        s3.setSide(5);

        System.out.println("The new side is: " + s1.getSide());
        System.out.println("The new side is: " + s2.getSide());
        System.out.println("The new side is: " + s3.getSide());
        System.out.println("\n");

        s1.setWidth(1); s1.setLength(1);
        s2.setLength(3); s2.setWidth(2);
        s3.setLength(5); s3.setLength(1);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
