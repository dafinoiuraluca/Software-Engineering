package Lab6.Ex1;

public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(500);
        BankAccount b2 = new BankAccount(20);

        b1.withdraw(100);
        b1.deposit(300);
        System.out.println("\n");

        b2.withdraw(30);
        b2.deposit(100);
        System.out.println("\n");

        System.out.println(b1.equals(b2));

        BankAccount b3 = new BankAccount("John", 400);
        BankAccount b4 = new BankAccount("John", 350);
        System.out.println(b3.equals(b4));

        System.out.println("\n");

        BankAccount b5 = new BankAccount("John", 400);
        BankAccount b6 = new BankAccount("John", 400);
        System.out.println(b5.equals(b6));

        if(b1.hashCode() == b2.hashCode()) {
            if(b1.equals(b2)) {
                System.out.println("Objects equal");
            }
            else {
                System.out.println("Objects not equal");
            }
        }
        else {
            System.out.println("Objects not equal");
        }

    }
}
