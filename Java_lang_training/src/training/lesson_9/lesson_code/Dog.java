package training.lesson_9.lesson_code;

public class Dog extends Animal {
    private boolean isVoice;

    public Dog(String color, boolean vegetarian, int weight, int movementSpeed, boolean isVoice) {
        super(color, vegetarian, weight, movementSpeed);
        this.isVoice = isVoice;
    }

    public boolean isVoice() {
        return isVoice;
    }

    public void setVoice(boolean voice) {
        isVoice = voice;
    }
    @Override
    public void speak() {
        System.out.println("Dog says wof");
    }
    @Override
    public String toString() {
        return "Dog{" +
                "isVoice=" + isVoice +
                ", color='" + color + '\'' +
                ", vegetarian=" + vegetarian +
                ", weight=" + weight +
                ", movementSpeed=" + movementSpeed +
                '}';
    }
}
