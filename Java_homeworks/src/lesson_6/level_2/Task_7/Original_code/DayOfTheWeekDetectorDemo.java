package lesson_6.level_2.Task_7.Original_code;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        /*----------------------------------*/ //1 часть программы
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : "); //отправить первую часть программы в отдельный метод
        int dayNumber = scanner.nextInt();
        /*int getDayNumberFromUser() { //метод не будет получать входные параметры
             Scanner scanner = new Scanner(System.in);
             System.out.print("Input day number between 1 and 7 : ");
             int dayNumber = scanner.nextInt();
        }
         */
        /*---------------------------------*/ //2 часть программы
        switch (dayNumber) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Not correct day number");
        }
    }
}
