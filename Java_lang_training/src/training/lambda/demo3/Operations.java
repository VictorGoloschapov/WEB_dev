package training.lambda.demo3;

/**
 * Можно использовать как переменные на уровне класса, так и локальные
 * переменные, объявленные в методе
 */
public class Operations {
    //переменные уровня класса
    static int x = 10;
    static int y = 30;

    public static void main(String[] args) {
        Operationable operationable = () -> { //метод calculate();
            y = 40;
            x = 30;
            return x + y;
        };

        int result = operationable.calculate();
        System.out.println(result);
        System.out.println(x);
        System.out.println(y);
    }
}
