package training.lesson_7;

public class CatApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setColor("Red");
        cat1.setAge(12);
        System.out.println("Cat age " + cat1.getAge());
        System.out.println("Cat color " + cat1.getColor());
    }
}
