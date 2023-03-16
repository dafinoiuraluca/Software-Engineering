package Lab6.Ex1;

public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount bankAccount = new BankAccount("John Snow", 600);
        bank.addAccount(bankAccount);

        BankAccount b = new BankAccount("John Snow", 600);
        bank.addAccount(b);

        BankAccount bankAccount1 = new BankAccount("Johnny", 588);

        bank.addAccount(bankAccount1);

        BankAccount bankAccount2 = new BankAccount("Raluca", 700);
        bank.addAccount(bankAccount2);

        BankAccount bankAccount3 = new BankAccount("Andrew William", 1000);
        bank.addAccount(bankAccount3);

        bank.printAccounts();
        bank.printAccounts(599.0, 650.0);
        bank.getAllAccounts();

        bank.getAccount("Andrew William");
        bank.getAccount("Raluca");

    }


}
