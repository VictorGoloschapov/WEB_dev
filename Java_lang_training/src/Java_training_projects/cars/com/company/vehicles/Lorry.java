package Java_training_projects.cars.com.company.vehicles;

import Java_training_projects.cars.com.company.details.Engine;
import Java_training_projects.cars.com.company.professions.Driver;

public class Lorry extends Car {
    private int carrying;

    public Lorry(String manufacturer, String vehicleClass, int vehicleWeight, Driver driver, Engine engine, int carrying) {
        super(manufacturer, vehicleClass, vehicleWeight, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }
    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                '}' + super.toString();
    }
}
