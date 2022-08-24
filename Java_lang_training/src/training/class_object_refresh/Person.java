package training.class_object_refresh;

public class Person {
    public String name;
    public int age;

    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name " + name);
        System.out.println("Age " + age);
    }
}
