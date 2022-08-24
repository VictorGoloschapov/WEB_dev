package training.Lesson_5;

public class ArrayUtils {
    static int sumOfArrayNumber(int[] array) {
        int sumNumbers = 0;
        for (int element : array) {
            sumNumbers += element;
        }
        return sumNumbers;
    }
    static void printArray(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
    }
}
