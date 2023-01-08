package training.Lesson_15.Homework.Level_2.Task_7;

public class Task {
    public static void main(String[] args) {
        QuadraticEq quadraticEq = new QuadraticEq();
        double a, b, c, discriminant;

        System.out.println("Result = " + quadraticEq.calc(1.0, -4.0, -5.0));

        a = 1.0;
        b = -4.0;
        c = -5.0;
        discriminant = b * b - 4 * a * c;
        System.out.println(discriminant);
    }
}
