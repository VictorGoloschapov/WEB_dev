package training;
import java.util.Scanner;

public class Authentification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String userName = "Victor";
        final String password = "qwerty!!";
        String login;
        String userPass;

        System.out.print("Enter username: ");
        login = input.nextLine();
        System.out.print("Enter password: ");
        userPass = input.nextLine();

        if((login.equals(userName)) && (userPass.equals(password))) {
            System.out.print("login successful");
        } else {
            System.out.print("login or password are incorrect");
        }
    }
}
