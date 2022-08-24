package training.lesson_10.lessoncode;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String model, int horsePower, int batteryCapacity) {
        super(model, horsePower);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void start() {
        if (batteryCapacity > 0) {
            System.out.println("Switched on");
            batteryCapacity--;
        } else {
            System.out.println("Battery is empty");
        }
    }

    @Override
    public void stop() {
        System.out.println("Switched off");
    }

    @Override
    public boolean updateComputerSystem() {
        if (batteryCapacity > 0) {
            System.out.println("Computer system updated");
            batteryCapacity--;
            return true;
        } else {
            System.out.println("Battery is empty");
            return false;
        }
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "model=" + getModel() + ", " +
                "batteryCapacity=" + batteryCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElectricCar that = (ElectricCar) o;
        return batteryCapacity == that.batteryCapacity;
    }
}
