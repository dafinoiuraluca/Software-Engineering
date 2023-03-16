package Lab6.Ex1;

public class TestBank2 {
    public static void main(String[] args) {
        Bank2 bank2 = new Bank2();
        BankAccount bankAccount = new BankAccount("Cineva", 43534);
        bank2.addAccounts(bankAccount);
        BankAccount bankAccount1 = new BankAccount("Altcineva", 79222);
        bank2.addAccounts(bankAccount1);
        BankAccount bankAccount2 = new BankAccount("Ion", 25);
        bank2.addAccounts(bankAccount2);
//        bank2.printAccounts();
//        bank2.printAccounts(12, 79000);
        //bank2.getAllAccounts();
//        bank2.getAccount("Ion");
    }
}
