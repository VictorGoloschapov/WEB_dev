package java_projects.banking_app_Rev1;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
        double amount = 0;
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

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid amount. Enter again :");
                        input.nextDouble();
                    }
                    amount = input.nextDouble();

                    System.out.println("amount: " + amount);

                    customer = new Customer(username, password, name, address, phone, amount, new Date());
                    bank.customerMap.put(username, customer);
                    System.out.println(bank.customerMap);
                    break;
                case 2:
                    System.out.println("Enter username: ");
                    username = input.next();
                    input.nextLine();
                    System.out.println("Enter password: ");
                    password = input.next();
                    input.nextLine();

                    if (bank.customerMap.containsKey(username)) {
                        customer = bank.customerMap.get(username);
                        if (password.equals(customer.password)) {
                            while (true) {
                                System.out.println("\n----------------");
                                System.out.println("W E L C O M E");
                                System.out.println("1. Deposit.");
                                System.out.println("2. Transfer.");
                                System.out.println("3. Last 5 transactions");
                                System.out.println("4. User information");
                                System.out.println("5. Log out");
                                System.out.println("\nEnter your choice: ");
                                choice = input.nextInt();
                                input.nextLine();

                                switch (choice) {
                                    case 1:
                                        System.out.println("Enter amount: ");
                                        while (!input.hasNextDouble()) {
                                            System.out.println("Invalid amount. Enter again: ");
                                            input.nextLine();
                                        }
                                        amount = input.nextDouble();
                                        input.nextLine();
                                        customer.deposit(amount, new Date());
                                        break;
                                    case 2:
                                        System.out.print("Enter payee username: ");
                                        username = input.next();
                                        input.nextLine();
                                        System.out.println("Enter amount: ");
                                        while (input.hasNextDouble()) {
                                            input.nextLine();
                                        }

                                        if (amount > 300000) {
                                            System.out.println("Transfer limit exceeded. Please contact bank manager");
                                            break;
                                        }

                                        if (bank.customerMap.containsKey(username)) {
                                            Customer payee = bank.customerMap.get(username);
                                            payee.deposit(amount, new Date());
                                            customer.withdraw(amount, new Date());
                                        } else {
                                            System.out.println("Username does not exist");
                                        }
                                        break;
                                    case 3:
                                        for (String transaction : customer.transactions) {
                                            System.out.println(transaction);
                                        }
                                        break;
                                    case 4:
                                        System.out.println("Account holder name: " + customer.name);
                                        System.out.println("Account holder address: " + customer.address);
                                        System.out.println("Account holder phone: " + customer.phone);
                                        System.out.println("Account holder username: " + customer.username);
                                        break;
                                    case 5:
                                        continue outer;
                                    default:
                                        System.out.println("Wrong choice!");
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter payee username: ");
                    username = input.next();
                    input.nextLine();

                    if (bank.customerMap.containsKey(username)) {
                        bank.customerMap.get(username).update(new Date());
                    } else {
                        System.out.print("User does not exist");
                    }
                    break;
                case 4:
                    System.out.println("\nThank you for choosing Bank Of Java");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Wrong choice !");
            }
        }
    }
}

