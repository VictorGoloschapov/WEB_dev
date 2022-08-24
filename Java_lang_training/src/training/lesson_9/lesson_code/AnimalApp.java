package training.lesson_9.lesson_code;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setColor("Brown");
        animal.setMovementSpeed(10);
        animal.setWeight(70);
        animal.setVegetarian(true);

        Animal secondAnimal = new Animal("Red", true, 10, 10);

        System.out.println(animal);
        System.out.println(secondAnimal);

        Cat cat = new Cat("Orange", true, 10, 15, "Bum");
        cat.speak();
        System.out.println(cat);

        Dog dog = new Dog("Black", false, 15, 30, true);
        System.out.println(dog);

        Tiger tiger = new Tiger("Yellow", false, 200, 45, "Amursky");
        System.out.println(tiger);
    }
}
