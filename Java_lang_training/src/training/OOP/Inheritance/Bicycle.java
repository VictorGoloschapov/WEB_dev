package training.OOP.Inheritance;

public class Bicycle {
    protected String brand;

    public Bicycle(String brand) {
        this.brand = brand;
    }

    public void showBicycleBrand() {
        System.out.println("Bicycle brand: " + brand);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
