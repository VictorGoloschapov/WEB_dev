package Lesson_5.homework.level_2;

public class Task12 {
    public static void main(String[] args) {
        double[] randomNumberArray = new double[3];

        for(int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = Math.random();
            System.out.println("Result is: " + randomNumberArray[i]);
        }
    }
}
