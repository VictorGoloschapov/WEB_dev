package Java_training_projects.java_guru.lesson_9.level_4.Task_15;

public class CalcDemo {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle area and perimeter", 20);

        System.out.println(circle.getTitle());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePermiter());
    }
}
