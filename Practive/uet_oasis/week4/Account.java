package uet_oasis.week4;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList;

    public Account() {
        this.balance = 0;
        transitionList = new ArrayList<>();
    }

    private void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    private void withdraw(double amount) {
        if (amount > 0) {
            if (amount > balance) {
                System.out.println("So tien ban rut vuot qua so du!");
            } else {
                this.balance -= amount;
            }
        } else {
            System.out.println("So tien ban rut ra khong hop le!");
        }
    }

    /**
     * Adds a transaction to the account's transaction history.
     * 
     * @param amount    the amount of the transaction
     * @param operation the type of transaction ("Deposit" or "Withdraw")
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }

        Transaction transaction = new Transaction(operation, amount, this.balance);
        transitionList.add(transaction);
    }

    /**
     * Prints out the transaction history of the account.
     * If there are no transactions, this method does nothing.
     */
    public void printTransaction() {
        if (transitionList.size() < 1) {
            return;
        } else {
            int i = 1;
            DecimalFormat df = new DecimalFormat("#.00");

            for (Transaction transaction : transitionList) {
                String printOperation = "";
                if (transaction.getOperation().equals("deposit")) {
                    printOperation = "Nap tien";
                } else if (transaction.getOperation().equals("withdraw")) {
                    printOperation = "Rut tien";
                }

                System.out.println("Giao dich " + i + ": "
                        + printOperation + " $"
                        + df.format(transaction.getAmount())
                        + ". So du luc nay: $" + df.format(transaction.getBalance())
                        + ".");
                i++;
            }

            i = 1;
        }
    }
}
