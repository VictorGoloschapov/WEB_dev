package java_projects.banking_app;

import java.util.*;
import java.text.*;

public class Customer implements SavingsAccount {
    String username;
    String password;
    String name;
    String address;
    String phone;
    double balance;
    ArrayList<String> transactions;

    public Customer(String username, String password, String name, String address, String phone, double balance, Date date) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.balance = balance;
        transactions = new ArrayList<>(5);
        addTransaction(String.format("Initial deposit - " +NumberFormat.getCurrencyInstance().format(balance)+" as on " + "%1$tD"+" at "+"%1$tT.",date));
    }

    public void update(Date date) {
        if (balance >= 10000) {
            balance += rate * balance;
        } else {
            balance -= (int) (balance / 100);
        }
        addTransaction(String.format("Account updated. Balance - " + NumberFormat.getCurrencyInstance().format(balance) + " as on " + "%1$tD" + " at " + "%1$tT" + date));
    }

    @Override
    public void deposit(double amount, Date date) {
        balance += amount;
        addTransaction(String.format(NumberFormat.getCurrencyInstance().format(amount) + " credited to your account. Balance -  " + NumberFormat.getCurrencyInstance().format(balance) + " as on " + "%1$tD" + " at " + "%1$tT" + date));
    }

    @Override
    public void withdraw(double amount, Date date) {
        if (amount > (balance - 200)) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
        addTransaction(String.format(NumberFormat.getCurrencyInstance().format(amount) + " debited from your account. Balance -  " + NumberFormat.getCurrencyInstance().format(balance) + " as on " + "%1$tD" + " at " + "%1$tT" + date));    }

    private void addTransaction(String message) {
        transactions.add(message);
        if (transactions.size() > 5) {
            transactions.remove(5);
            transactions.trimToSize();
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", balance=" + balance +
                ", transactions=" + transactions +
                '}';
    }
}
