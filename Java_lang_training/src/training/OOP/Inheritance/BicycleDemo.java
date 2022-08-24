package training.OOP.Inheritance;

public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Salut");
        MTBbike mountainBike = new MTBbike("BMX");

        System.out.println(bicycle);
        System.out.println(mountainBike);
        System.out.println("");
        bicycle.showBicycleBrand();
        mountainBike.showBicycleBrand();
    }
}
