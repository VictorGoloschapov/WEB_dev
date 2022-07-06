package lesson_3;

public class User {
    String name;
    int age;

    public User(String userName, int userAge) {
        this.name = userName;
        this.age = userAge;
    }
    void showUser() {
        System.out.println("User name: " + name);
        System.out.println("User age: " + age);
    }
}
