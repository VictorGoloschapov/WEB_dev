package Lesson_5.homework.level_2;

public class Task14 {
    public static void main(String[] args) {
        double rangeTill100 = 100.0;
        double[] numberArray = new double[3];
        double arrayLength = numberArray.length;
        double sumResult = 0.0;
        double avgNumberResult;

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = Math.rint(Math.random() * rangeTill100);
            sumResult += numberArray[i];
        }
        System.out.println("Сумма всех элементов массива: " + (int) sumResult);
        avgNumberResult = sumResult / arrayLength;
        System.out.println("среднее значение всех элементов массива: " + avgNumberResult);
    }
}
