package Java_training_projects.cars.com.company.vehicles;

import Java_training_projects.cars.com.company.details.Engine;
import Java_training_projects.cars.com.company.professions.Driver;

public class Car {
    private String manufacturer;
    private String vehicleClass;
    private int vehicleWeight;
    private Driver driver;
    private Engine engine;

    public Car(String manufacturer, String vehicleClass, int vehicleWeight, Driver driver, Engine engine) {
        this.manufacturer = manufacturer;
        this.vehicleClass = vehicleClass;
        this.vehicleWeight = vehicleWeight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public int getVehicleWeight() {
        return vehicleWeight;
    }

    public void setVehicleWeight(int vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", vehicleClass='" + vehicleClass + '\'' +
                ", vehicleWeight=" + vehicleWeight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
