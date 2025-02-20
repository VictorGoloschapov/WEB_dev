package training.level_2.Task_9;

import java.util.Scanner;

public class DayOfTheWeekDetector {
    public int getDayNumberFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return input.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        switch (dayNumber) {
            case 1 -> {
                return "Monday";
            }
            case 2 -> {
                return "Tuesday";
            }
            case 3 -> {
                return "Wednesday";
            }
            case 4 -> {
                return "Thursday";
            }
            case 5 -> {
                return "Friday";
            }
            case 6 -> {
                return "Saturday";
            }
            case 7 -> {
                return "Sunday";
            }
            default -> {
                return "Not correct day number";
            }
        }
    }
}
