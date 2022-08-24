package Java_training_projects.cars.com.company.vehicles;

import Java_training_projects.cars.com.company.details.Engine;
import Java_training_projects.cars.com.company.professions.Driver;

public class CarDemo {
    public static void main(String[] args) {
        Driver bmwDriver = new Driver("Victor", 30, false, 11);
        Engine bmwEngine = new Engine("BMW", 280);
        Car car = new Car("BMW", "B", 2150, bmwDriver, bmwEngine);

        Driver lorryDriver = new Driver("Oleg", 50, false, 20);
        Engine lorryEngine = new Engine("CAT", 560);
        Lorry scania = new Lorry("Scania", "C", 5000, lorryDriver, lorryEngine, 25000);

        Driver sportsCarDriver = new Driver("Scuko", 45, false, 5);
        Engine sportsCarEngine = new Engine("Audi", 450);
        SportsCar audiR8 = new SportsCar("Audi", "B", 1200, sportsCarDriver, sportsCarEngine, 310);

        System.out.println(car);
        System.out.println();
        System.out.println(scania);
        System.out.println();
        System.out.println(audiR8);
    }
}
