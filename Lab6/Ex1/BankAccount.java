package Lab6.Ex1;

import java.util.Comparator;
import java.util.Objects;

public class BankAccount implements Comparable<BankAccount> {
    private String owner;
    private double balance;

    @Override
    public int compareTo(BankAccount b) {
        double comp_balance = (double) ((BankAccount)b).getBalance();
        return (int) (this.balance - comp_balance);
    }


//    public int compareTo(BankAccount b1, BankAccount b2) {
//        int compareName = b1.getOwner().compareTo(b2.getOwner());
//        if(compareName == 0) {
//            return (0 - Double.compare(b1.getBalance(), b2.getBalance()));
//        }
//        else
//            return compareName;
//    }


    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("The balance is: " + this.balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("The balance is: " + this.balance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.balance, balance) == 0 && Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, balance);
    }

    @Override
    public String toString() {
        return "BankAccount: " +
                "owner: '" + owner +
                "', balance: " + balance;
    }


//    public int compare(BankAccount b1, BankAccount b2) {
//        return b1.getOwner().compareTo(b2.getOwner());
//    }
}
