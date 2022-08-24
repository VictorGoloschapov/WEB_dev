package training.java_lang_Math;

import java.lang.Math;

public class MathClass {
    public static void main(String[] args) {
        final double PI = Math.PI;
        System.out.println(PI);
        //Math.pow(number, pow)
        System.out.println(Math.pow(2, 3));
        //Квадратный корень Math.sqrt(number)
        System.out.println(Math.sqrt(4));
        //Math.round
        double d1 = 1.5;
        double d2 = 1.4;
        System.out.println("d1 = " + Math.round(d1));
        System.out.println("d2 = " + Math.round(d2));
    }
}
