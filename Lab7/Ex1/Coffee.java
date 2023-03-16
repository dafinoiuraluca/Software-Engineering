package Lab7.Ex1;

public class Coffee {
    private int temp;
    private int conc;
    private int no_of_coffees;
    Coffee(int t, int c, int n) {
        temp = t;
        conc = c;
        no_of_coffees = n;
    }
    int getTemp() {
        return temp;
    }
    int getConc() {
        return conc;
    }

    public int getNo_of_coffees() {
        return no_of_coffees;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "temp=" + temp +
                ", conc=" + conc +
                ", no_of_coffees=" + no_of_coffees +
                '}';
    }
}
