package Lesson_5;

//loops while for do-while

public class Lesson5 {

    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("I = " + i);
            i++;
        }

        for (int a = 0; a < 10; a++) {
            System.out.println("a= " + a);
        }

        int b = 0;
        do {
            System.out.println("b = " + b);
            b++;
        } while (b < 5);
    }
}
