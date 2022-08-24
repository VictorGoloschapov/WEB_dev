package Java_training_projects.java_guru.lesson_9.level_4.Task_15;

public abstract class Shape {
    private String title;

    public Shape(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    abstract double calculateArea();
    abstract double calculatePermiter();
}
