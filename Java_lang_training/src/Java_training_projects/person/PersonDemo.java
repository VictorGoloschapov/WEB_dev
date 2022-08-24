package Java_training_projects.person;

public class PersonDemo {
    public static void main(String[] args) {
        Person olga = new Person();
        olga.setFullName("Olga");
        olga.setAge(30);

        Person victor = new Person("Victor", 32);

        olga.move(olga);
        olga.talk(olga);
        victor.move(victor);
        victor.talk(victor);
    }
}
