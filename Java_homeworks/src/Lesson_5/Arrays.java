package Lesson_5;

public class Arrays {
    public static void main(String[] args) {
        String[] vehicles = new String[5];
        vehicles[0] = "Car";
        vehicles[1] = "Bus";
        vehicles[2] = "Ship";
        vehicles[3] = "Motorbike";
        vehicles[4] = "Truck";

        /*String[] vehicles = {"Car", "Bus", "Ship", "Motorbike", "Truck"};
        System.out.println("vehicles array length: " + vehicles.length);
        System.out.println("Array second element :" + vehicles[2]);

        for (String vehicle: vehicles) {
            System.out.println(vehicle);
        }
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i]);
        }
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i] = "Car");
        }*/

        int[] numbers = {1, 2, 3, 4};
        /*int sum = 0;

        for (int element: numbers) {
            sum += element; // sum = element + sum
            System.out.println(sum);
        }
        System.out.println(sum);*/

        //вызов статического метода sumOfArrayNumber без создания объекта
        int sum = ArrayUtils.sumOfArrayNumber(numbers);
        ArrayUtils.printArray(vehicles);
        System.out.println("Sum of array numbers from static method: " + sum);
    }
}
