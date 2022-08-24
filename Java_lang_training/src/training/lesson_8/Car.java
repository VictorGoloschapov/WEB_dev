package training.lesson_8;

import java.util.Objects;

public class Car {
    private String brand;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    //переопределение equals для сравнения полей объекта
    @Override
    public boolean equals(Object o) {
        if (this == o) { // объект 1 равен объекту, поданному как параметр
            return true;
        }
        if (o == null || getClass() != o.getClass()) { //объект == null || объект другого класса
            return false;
        }
        Car car = (Car) o; //приведение к типу Car
        return Objects.equals(brand, car.brand);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Audi");
        Car car2 = new Car();
        car2.setBrand("Audi");
        Car car3 = car1;

        car1.equals(car3);
    }
}
