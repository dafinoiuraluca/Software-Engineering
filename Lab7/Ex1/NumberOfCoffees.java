package Lab7.Ex1;

public class NumberOfCoffees extends Exception {
    int max_no_of_coffees;

    public NumberOfCoffees(int m, String msg) {
        super(msg);
        this.max_no_of_coffees = m;
    }

    public int getMax_no_of_coffees() {
        return max_no_of_coffees;
    }
}
