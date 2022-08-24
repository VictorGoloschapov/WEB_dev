package training.different_topics;

import java.util.Scanner;

public class Authentification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String userName = "Olga1";
        final String password = "qwerty!!";
        String login;
        String userPass;

        System.out.print("Enter username: ");
        login = input.nextLine();
        System.out.print("Enter password: ");
        userPass = input.nextLine();

        if ((!login.equals("")) && (!userPass.equals(""))) {
            if ((login.equals(userName)) && (userPass.equals(password))) {
                System.out.print("login successful");
            } else {
                System.out.print("login or password are incorrect");
            }
        } else {
            System.out.print("please enter a value");
        }
    }
}

