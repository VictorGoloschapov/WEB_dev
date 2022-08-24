package training.different_topics;

import java.util.Scanner;

public class Demo {



        public static void main(String[] args) {
            int value = 0;
            boolean t = true;
            boolean f = false, b;
            b = t | (value++ == 0);
            //b = f | ((value += 3) > 0);
            System.out.println(value);
        }


    public static boolean isSmallNumber(int n) {
        if (n < 5) {
            System.out.println("n < 5");
            return true;
        } else {
            System.out.println("n >= 5");
            return false;
        }
    }
}