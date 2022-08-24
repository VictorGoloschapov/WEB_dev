package Java_training_projects.cars.com.company.professions;

public class Driver extends Person {
    private int driverExperience;

    public Driver(String fullName, int age, boolean retired, int driverExperience) {
        super(fullName, age, retired);
        this.driverExperience = driverExperience;
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    public void setDriverExperience(int driverExperience) {
        this.driverExperience = driverExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverExperience=" + driverExperience +
                '}' + super.toString();
    }
}
