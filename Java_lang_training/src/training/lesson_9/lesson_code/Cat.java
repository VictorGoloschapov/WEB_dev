package training.lesson_9.lesson_code;

public class Cat extends Animal {
    private String brand;

    public Cat(String color, boolean vegetarian, int weight, int movementSpeed, String brand) {
        super(color, vegetarian, weight, movementSpeed);
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void speak() {
        System.out.println("Cat says meow");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", vegetarian=" + vegetarian +
                ", weight=" + weight +
                ", movementSpeed=" + movementSpeed +
                '}';
    }
}
