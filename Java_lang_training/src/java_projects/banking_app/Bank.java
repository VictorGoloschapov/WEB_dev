package java_projects.banking_app;

import java.util.*;
import java.text.*;

public class Bank {
    Map<String, Customer> customerMap;

    public Bank() {
        customerMap = new HashMap<>();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer customer;
        String username;
        String password;
        double amount;
        int choice;
        Bank bank = new Bank();

        outer:while (true) {
            System.out.println("\n---------------------");
            System.out.println("BANK    OF    JAVA");
            System.out.println("---------------------\n");
            System.out.println("1. Register account.");
            System.out.println("2. Login.");
            System.out.println("3. Update accounts.");
            System.out.println("4. Exit.");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Wrong choice !");
            }
        }
    }
}

