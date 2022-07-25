package Lesson_5.homework.level_2;

import java.util.stream.StreamSupport;

public class Task13 {
    public static void main(String[] args) {
        int rangeTill100 = 100;
        int[] randomNumberArray = new int[3];
        for (int i = 0; i < randomNumberArray.length; i ++) {
            randomNumberArray[i] = (int) (Math.random() * rangeTill100);
            System.out.println("Final result: " + randomNumberArray[i]);
        }
    }
}
