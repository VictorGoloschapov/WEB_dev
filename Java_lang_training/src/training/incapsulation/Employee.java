package training.incapsulation;

public class Employee {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void showName() {
        System.out.println("Employee name " + getName());
    }
    public void showAge() {
        System.out.println("Employee age " + getAge());
    }
}
