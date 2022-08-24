package training.lesson_9.lesson_code;

public class Tiger extends Cat {
    private String naturalHabitat;

    public Tiger(String color, boolean vegetarian, int weight, int movementSpeed, String brand) {
        super(color, vegetarian, weight, movementSpeed, brand);
        this.naturalHabitat = "Africa";
    }

    public String getNaturalHabitat() {
        return naturalHabitat;
    }

    public void setNaturalHabitat(String naturalHabitat) {
        this.naturalHabitat = naturalHabitat;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "naturalHabitat='" + naturalHabitat + '\'' +
                ", color='" + color + '\'' +
                ", vegetarian=" + vegetarian +
                ", weight=" + weight +
                ", movementSpeed=" + movementSpeed +
                '}';
    }
}
