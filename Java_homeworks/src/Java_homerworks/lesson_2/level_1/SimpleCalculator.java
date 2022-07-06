//Task 1
package Java_homerworks.lesson_2.level_1;
import java.util.Scanner;

public class SimpleCalculator {
    public static void  main(String[] args) {
        //create Scanner obj
        Scanner input = new Scanner(System.in);

        //declare vars
        int num1,
            num2,
            sumResult,
            substResult,
            divideResult,
            multResult;

        System.out.println("Welcome to simple calculator");

        System.out.print("Please enter number 1: ");
        num1 = input.nextInt();

        System.out.print("Please enter number 2: ");
        num2 = input.nextInt();

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
