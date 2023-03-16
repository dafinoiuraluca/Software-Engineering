package Lab5.Ex2;

public class ImageTest {
    public static void main(String[] args) {
        Image i = new ProxyImage("test.png", false);
        i.display();
        Image i2 = new ProxyImage("bla.jpg", true);
        i2.display();
    }
}
