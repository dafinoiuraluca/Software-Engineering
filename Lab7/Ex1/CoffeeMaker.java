package Lab7.Ex1;

public class CoffeeMaker {
    Coffee makeCofee() {
        System.out.println("Make a coffe");
        int t = (int)(Math.random()*100);
        int c = (int)(Math.random()*100);
        int n = (int)(Math.random()*100);
        Coffee cofee = new Coffee(t, c, n);
        return cofee;
    }

}
