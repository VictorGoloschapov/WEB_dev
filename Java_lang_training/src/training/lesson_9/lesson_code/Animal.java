package training.lesson_9.lesson_code;

public class Animal {
    protected String color;
    protected boolean vegetarian;
    protected int weight;
    protected int movementSpeed;

    public void speak() {
        System.out.println("...");
    }
    public Animal() {}
    public Animal(String color, boolean vegetarian, int weight, int movementSpeed) {
        this.color = color;
        this.vegetarian = vegetarian;
        this.weight = weight;
        this.movementSpeed = movementSpeed;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", vegetarian=" + vegetarian +
                ", weight=" + weight +
                ", movementSpeed=" + movementSpeed +
                '}';
    }
}
