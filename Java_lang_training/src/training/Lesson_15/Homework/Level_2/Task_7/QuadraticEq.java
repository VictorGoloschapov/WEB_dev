package training.Lesson_15.Homework.Level_2.Task_7;

public class QuadraticEq {
    public String calc(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            return discriminantGreaterThanZero(a, b, discriminant);
        } else if (discriminant == 0) {
            return discriminantEqualsZero(a, b);
        } else {
            return discriminantLessThanZero();
        }
    }

    public String discriminantGreaterThanZero(double a, double b, double discriminant) {
        double x1, x2;
        x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        return "x1 = " + x1 + ", x2 = " + x2;
    }

    public String discriminantEqualsZero(double a, double b) {
        double x;
        x = -b / (2 * a);
        return "x = " + x;
    }

    public String discriminantLessThanZero() {
        return "Equation has no roots";
    }
}
