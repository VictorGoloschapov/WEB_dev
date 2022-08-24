package Java_training_projects.cars.com.company.vehicles;

import Java_training_projects.cars.com.company.details.Engine;
import Java_training_projects.cars.com.company.professions.Driver;

public class SportsCar extends Car {
    private int topSpeed;

    public SportsCar(String manufacturer, String vehicleClass, int vehicleWeight, Driver driver, Engine engine, int topSpeed) {
        super(manufacturer, vehicleClass, vehicleWeight, driver, engine);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "SportsCar{" +
                "topSpeed=" + topSpeed +
                '}' + super.toString();
    }
}
