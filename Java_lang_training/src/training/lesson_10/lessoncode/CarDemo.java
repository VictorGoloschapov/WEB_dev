package training.lesson_10.lessoncode;

public class CarDemo {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Tesla 2", 500, 100);
        String electricCarInfo = electricCar.toString();
        System.out.println(electricCarInfo);

        PetrolCar petrolCar = new PetrolCar("Ford Mustang", 500);

        electricCar.start();
        electricCar.stop();

        petrolCar.start();
        petrolCar.stop();

        ElectricCar electricCar2 = new ElectricCar("Daisau", 100, 2);
        electricCar2.start();
        electricCar2.stop();
        electricCar2.start();
        electricCar2.updateComputerSystem();

        Car[] cars = {electricCar, petrolCar, electricCar2};
        for (Car car: cars) {
            car.updateComputerSystem();
        }

        petrolCar.increasePower(petrolCar, 300);
    }
}
