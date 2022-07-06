package lesson_3;

public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        System.out.println("Передаваемое имя:" + name);
    }
    public void setAge(int age) {
        this.puppyAge = age;
    }
    public int getAge() {
        System.out.println("Возраст щенка:" + puppyAge );
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy nike = new Puppy("Nike");
        nike.setAge(3);
        nike.getAge();

        Puppy sam = new Puppy("Sam");
        sam.setAge(5);
        sam.getAge();
    }
}
