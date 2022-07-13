package lesson_3.homework.level_4.task_16;

class Car {

    String model;

    public Car(String newModel) {
        this.model = newModel;
    }

    public String getModel() { //добавил скобки после названия метода
        return this.model; //добавил точку с запятой после возврата значения переменной
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}