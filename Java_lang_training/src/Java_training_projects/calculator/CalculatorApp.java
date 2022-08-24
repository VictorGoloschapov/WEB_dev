package Java_training_projects.calculator;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int number1 = calculator.getNumber();
        int number2 = calculator.getNumber();
        char mathOperation = calculator.getMathOperation();
        int result = calculator.calculation(number1, number2, mathOperation);
        System.out.println("Calculation result: " + result);
    }
}
