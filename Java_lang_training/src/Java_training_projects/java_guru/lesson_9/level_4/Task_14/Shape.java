package Java_training_projects.java_guru.lesson_9.level_4.Task_14;

public abstract class Shape {
    private String title;

    public Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
}
