package training.lesson_10.lessoncode;

public class PetrolCar extends Car implements CarWorkShop {
        public PetrolCar(String model, int horsePower) {
                super(model, horsePower);
        }

        @Override
        public void start() {
                System.out.println("Start petrol engine");
        }

        @Override
        public void stop() {
                System.out.println("Stop petrol engine");
        }

        @Override
        public boolean updateComputerSystem() {
                System.out.println("Update computer system");
                return true;
        }


        @Override
        public void increasePower(Car car, int increaseAmount) {
                int currentHorsePower = car.getHorsePower();
                System.out.println("Car " + car.getModel() + "HP before upgrade is " + car.getHorsePower());
                car.setHorsePower(currentHorsePower + increaseAmount);
                System.out.println("Car " + car.getModel() + "HP after upgrade is " + car.getHorsePower());
        }
}
