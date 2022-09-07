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

        outer:
        while (true) {
            System.out.println("\n---------------------");
            System.out.println("BANK    OF    JAVA");
            System.out.println("---------------------\n");
            System.out.println("1. Register account.");
            System.out.println("2. Login.");
            System.out.println("3. Update accounts.");
            System.out.println("4. Exit.");
            System.out.print("\nEnter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = input.nextLine();
                    System.out.print("Enter address: ");
                    String address = input.nextLine();
                    System.out.print("Enter contact phone: ");
                    String phone = input.nextLine();
                    System.out.print("Set username: ");
                    username = input.next();

                    while (bank.customerMap.containsKey(username)) {
                        System.out.println("Username already exists. Set again: ");
                        username = input.next();
                    }

                    System.out.println("Set a password (minimum 8 chars; minimum 1 digit, 1 lowercase, 1 uppercase, 1 special character[!@#$%^&*_]) :");
                    password = input.next();
                    input.nextLine();

                    while (!password.matches((("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*_]).{8,}")))) {
                        System.out.println("Invalid password condition. Set again: ");
                        password = input.next();
                    }

                    System.out.print("Enter initial deposit : ");

                    while(!input.hasNextDouble())
                    {
                        System.out.println("Invalid amount. Enter again :");
                        input.nextDouble();
                    }
                    amount=input.nextDouble();

                    System.out.println("amount: " + amount);

                    customer = new Customer(username, password, name, address, phone, amount, new Date());
                    bank.customerMap.put(username, customer);
                    System.out.println(bank.customerMap);
                    break;
                case 2:
                    System.out.println("Option 2 chose");
                    break;
                case 3:
                    System.out.println("Option 3 chose");
                    break;
                case 4:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Wrong choice !");
            }
        }
    }
}

