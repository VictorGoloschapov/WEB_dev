package Java_training_projects.java_guru.lesson_9.level_4.Task_15;

import java.lang.Math;

public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }
    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }
    public double calculatePermiter() {
        return 2 * PI * radius;
    }
}
