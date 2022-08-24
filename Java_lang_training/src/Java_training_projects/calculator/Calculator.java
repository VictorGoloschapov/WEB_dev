package Java_training_projects.calculator;

import java.util.Scanner;

public class Calculator implements ArithmeticsOperation {
    Scanner input = new Scanner(System.in);

    @Override
    public int getNumber() {
        System.out.print("Enter a number: ");
        int number;

        if (input.hasNextInt()) {
            number = input.nextInt();
        } else {
            System.out.println("You entered not a number");
            input.next();//рекурсия
            number = getNumber();
        }

        return number;
    }

    @Override
    public char getMathOperation() {
        System.out.print("Enter a math operator ( +, -, /, *): ");
        char mathOperator;
        if (input.hasNext()) {
            mathOperator = input.next().charAt(0);
        } else {
            System.out.println("You entered wrong symbol");
            input.next();
            mathOperator = getMathOperation();
        }
        return mathOperator;
    }

    @Override
    public int calculation(int num1, int num2, char mathOperator) {
        int result;
        switch (mathOperator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Math operation not correct. Please try again");
                result = calculation(num1, num2, getMathOperation());
        }
        return result;
    }
}
