package Java_training_projects.cars.com.company.details;

public class Engine {
    private String engineManufacturer;
    private int enginePower;

    public Engine(String engineManufacturer, int enginePower) {
        this.engineManufacturer = engineManufacturer;
        this.enginePower = enginePower;
    }

    public String getEngineManufacturer() {
        return engineManufacturer;
    }

    public void setEngineManufacturer(String engineManufacturer) {
        this.engineManufacturer = engineManufacturer;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineManufacturer='" + engineManufacturer + '\'' +
                ", enginePower=" + enginePower +
                '}';
    }
}
