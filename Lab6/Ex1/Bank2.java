package Lab6.Ex1;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Iterator;

public class Bank2 {
    TreeSet<BankAccount> bankAccountTreeSet = new TreeSet<>((o1, o2) -> (int) (o1.getBalance() - o2.getBalance()));
    Iterator<BankAccount> it = bankAccountTreeSet.iterator();

    public void addAccounts(BankAccount b) {
        bankAccountTreeSet.add(b);
    }

    public void printAccounts() {
        bankAccountTreeSet.stream().sorted();
        for(BankAccount b : bankAccountTreeSet) {
            System.out.println(b);
            System.out.println("\n");
        }
    }

    public void printAccounts(double minBalance, double maxBalance) {
        for(BankAccount b : bankAccountTreeSet)
        {
            if(b.getBalance() > minBalance && b.getBalance() < maxBalance) {
                System.out.println(b);
            }
        }
    }

//    public void getAllAccounts() {
//        BankAccount tmp;
//        if(bankAccountTreeSet.size() > 1) {
//            for(BankAccount b : bankAccountTreeSet) {
//                while(it.hasNext()) {
//                    if(b.getOwner().compareTo(it.next().getOwner()) > 0) {
//                        tmp = b;
//                        b = it.next();
//                        it.next() = tmp;
//                    }
//                }
//            }
//        }
//        for(BankAccount b : bankAccountTreeSet) {
//            System.out.println(b);
//        }
//    }

    public BankAccount getAccount(String owner) {
        for(BankAccount b : bankAccountTreeSet) {
            if(b.getOwner().equals(owner)) {
                System.out.println(b);
            }
        }
        return null;
    }
}
