package training.lesson4.homework.level4;

//тестируем работу калькулятора
import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstTestNum;
        int secondTestNum;
        int expectedResult;

        System.out.print("Please enter first test number: ");
        firstTestNum = input.nextInt();
        System.out.print("Please enter second test number: ");
        secondTestNum = input.nextInt();
        System.out.print("Please enter expected result: ");
        expectedResult = input.nextInt();

        //создаем объект CalculatorTest, для работы с его методами
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest(firstTestNum, secondTestNum, expectedResult);
        calculatorTest.diffTest(firstTestNum, secondTestNum, expectedResult);
        calculatorTest.divTest(firstTestNum, secondTestNum, expectedResult);
        calculatorTest.multTest(firstTestNum, secondTestNum, expectedResult);
    }
    public void sumTest(int a, int b, int c) {
        int firstNumber = a; // подготавливаем тестовые данные
        int secondNumber = b; // подготавливаем тестовые данные
        int expectedResult = c; // подготавливаем тестовые данные
        int realResult;

        //для доступа к методам в классе Calculator создаем объект
        Calculator calculator = new Calculator();
        realResult = calculator.sum(firstNumber, secondNumber); // вызываем продакшен код, который хотим протестировать
        if(realResult == expectedResult) {
            System.out.println("Sum test is ok");
        } else {
            System.out.println("Sum test filed");
        }
    }
    public void diffTest(int a, int b, int c) {
        int firstNumber = a; // подготавливаем тестовые данные
        int secondNumber = b; // подготавливаем тестовые данные
        int expectedResult = c; // подготавливаем тестовые данные
        int realResult;

        //для доступа к методам в классе Calculator создаем объект
        Calculator calculator = new Calculator();
        realResult = calculator.diff(firstNumber, secondNumber); // вызываем продакшен код, который хотим протестировать
        if(realResult == expectedResult) {
            System.out.println("Difference test is ok");
        } else {
            System.out.println("Difference test filed");
        }
    }
    public void divTest(int a, int b, int c) {
        int firstNumber = a; // подготавливаем тестовые данные
        int secondNumber = b; // подготавливаем тестовые данные
        int expectedResult = c; // подготавливаем тестовые данные
        int realResult;

        //для доступа к методам в классе Calculator создаем объект
        Calculator calculator = new Calculator();
        realResult = calculator.div(firstNumber, secondNumber); // вызываем продакшен код, который хотим протестировать
        if(realResult == expectedResult) {
            System.out.println("Division test is ok");
        } else {
            System.out.println("Division test filed");
        }
    }
    public void multTest(int a, int b, int c) {
        int firstNumber = a; // подготавливаем тестовые данные
        int secondNumber = b; // подготавливаем тестовые данные
        int expectedResult = c; // подготавливаем тестовые данные
        int realResult;

        //для доступа к методам в классе Calculator создаем объект
        Calculator calculator = new Calculator();
        realResult = calculator.mult(firstNumber, secondNumber); // вызываем продакшен код, который хотим протестировать
        if(realResult == expectedResult) {
            System.out.println("Multiplication test is ok");
        } else {
            System.out.println("Multiplication test filed");
        }
    }
}
