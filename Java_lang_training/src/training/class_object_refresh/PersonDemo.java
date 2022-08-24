package training.class_object_refresh;

public class PersonDemo {
    public static void main(String[] args) {
        Person tom = new Person();
        tom.age = 30;
        tom.name = "Tom";

        tom.displayInfo();

        Person olga = new Person("Olga", 30);
        olga.displayInfo();
    }
}
