//Task 2
package Java_homerworks.lesson_2.level_1;
import java.util.Scanner;

public class FloatNumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1,
               num2,
               sumResult,
               substResult,
               divideResult,
               multResult;

        System.out.println("Welcome to simple calculator");

        System.out.print("Please enter franumber 1: ");
        num1 = scanner.nextDouble();

        System.out.print("Please enter number 2: ");
        num2 = scanner.nextDouble();

        //Сверить с лекцией 2
        //Need to round?
        sumResult = num1 + num2;
        substResult = num1 - num2;
        divideResult = num1 / num2;
        multResult = num1 * num2;

        System.out.println("\n");
        System.out.println("Below you can see calculation results");
        System.out.println("=================================");
        System.out.println("Sum result: " + sumResult);
        System.out.println("Subtraction result: " + substResult);
        System.out.println("Division result: " + divideResult);
        System.out.println("Multiplication result: " + multResult);
    }
}
