package training.lesson4.homework.level2;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Введите целое число 1: ");
        number1 = input.nextInt();

        System.out.print("Введите целое число 2: ");
        number2 = input.nextInt();

        if (number1 == number2) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
