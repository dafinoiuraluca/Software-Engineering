package Lab6.Ex1;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public void addAccount(BankAccount b) {
        bankAccounts.add(b);
    }

    public void printAccounts() {
        BankAccount temp;
        if (bankAccounts.size() > 1) {
            for (int i = 0; i < bankAccounts.size(); i++) {
                for (int j = 0; j < bankAccounts.size() - 1; j++) {
                    if (bankAccounts.get(j).compareTo(bankAccounts.get(j + 1)) > 0) {
                        temp = bankAccounts.get(j);
                        bankAccounts.set(j, bankAccounts.get(j + 1));
                        bankAccounts.set(j + 1, temp);
                    }
                }
            }
        }
        for (int i = 0; i < bankAccounts.size(); i++) {
            System.out.println(bankAccounts.get(i));
            System.out.println("\n");
        }

    }

    public void printAccounts(double minBalance, double maxBalance) {
        for (int i = 0; i < bankAccounts.size(); i++) {
            if ((bankAccounts.get(i).getBalance() > minBalance) && (bankAccounts.get(i).getBalance() < maxBalance)) {
                System.out.println(bankAccounts.get(i));
            }
        }
    }


    public BankAccount getAccount(String owner) {
        for (BankAccount b : bankAccounts) {
            if(b.getOwner().equals(owner)) {
                System.out.println(b);
            }
        }
        return null;
    }


    public void getAllAccounts() {
        BankAccount temp;
        if (bankAccounts.size() > 1) {
            for (int i = 0; i < bankAccounts.size(); i++) {
                for (int j = 0; j < bankAccounts.size() - 1; j++) {
                    if(bankAccounts.get(j).getOwner().compareTo(bankAccounts.get(j + 1).getOwner()) > 0) {
                        temp = bankAccounts.get(j);
                        bankAccounts.set(j, bankAccounts.get(j + 1));
                        bankAccounts.set(j + 1, temp);
                    }
                }
            }
        }
        for(int i = 0; i < bankAccounts.size(); i++) {
            System.out.println(bankAccounts.get(i));
            System.out.println("\n");
        }
    }

}




