package lesson_6.level_2.Task_7.Task_code;

public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        findMonday();
        findTuesday();
        findWednesday();
        findThursday();
        findFriday();
        findSaturday();
        findSunday();
    }

    static void findMonday() {
        DayOfTheWeekDetectorDemo weekDay = new DayOfTheWeekDetectorDemo();
        int day = 1;
        String expectedResult = "Monday";
        String actualResult = weekDay.findDayOfTheWeek(day);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test passed, expected result: " + expectedResult);
        } else {
            System.out.println("Test failed");
            System.out.println("Actual result: " + actualResult);
            System.out.println("Expected result: " + expectedResult);
        }
    }

    static void findTuesday() {
        DayOfTheWeekDetectorDemo weekDay = new DayOfTheWeekDetectorDemo();
        int day = 2;
        String expectedResult = "Tuesday";
        String actualResult = weekDay.findDayOfTheWeek(day);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test passed, expected result: " + expectedResult);
        } else {
            System.out.println("Test failed");
            System.out.println("Actual result: " + actualResult);
            System.out.println("Expected result: " + expectedResult);
        }
    }

    static void findWednesday() {
        DayOfTheWeekDetectorDemo weekDay = new DayOfTheWeekDetectorDemo();
        int day = 3;
        String expectedResult = "Wednesday";
        String actualResult = weekDay.findDayOfTheWeek(day);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test passed, expected result: " + expectedResult);
        } else {
            System.out.println("Test failed");
            System.out.println("Actual result: " + actualResult);
            System.out.println("Expected result: " + expectedResult);
        }
    }

    static void findThursday() {
        DayOfTheWeekDetectorDemo weekDay = new DayOfTheWeekDetectorDemo();
        int day = 4;
        String expectedResult = "Thursday";
        String actualResult = weekDay.findDayOfTheWeek(day);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test passed, expected result: " + expectedResult);
        } else {
            System.out.println("Test failed");
            System.out.println("Actual result: " + actualResult);
            System.out.println("Expected result: " + expectedResult);
        }
    }

    static void findFriday() {
        DayOfTheWeekDetectorDemo weekDay = new DayOfTheWeekDetectorDemo();
        int day = 5;
        String expectedResult = "Friday";
        String actualResult = weekDay.findDayOfTheWeek(day);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test passed, expected result: " + expectedResult);
        } else {
            System.out.println("Test failed");
            System.out.println("Actual result: " + actualResult);
            System.out.println("Expected result: " + expectedResult);
        }
    }

    static void findSaturday() {
        DayOfTheWeekDetectorDemo weekDay = new DayOfTheWeekDetectorDemo();
        int day = 6;
        String expectedResult = "Saturday";
        String actualResult = weekDay.findDayOfTheWeek(day);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test passed, expected result: " + expectedResult);
        } else {
            System.out.println("Test failed");
            System.out.println("Actual result: " + actualResult);
            System.out.println("Expected result: " + expectedResult);
        }
    }

    static void findSunday() {
        DayOfTheWeekDetectorDemo weekDay = new DayOfTheWeekDetectorDemo();
        int day = 7;
        String expectedResult = "Sunday";
        String actualResult = weekDay.findDayOfTheWeek(day);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test passed, expected result: " + expectedResult);
        } else {
            System.out.println("Test failed");
            System.out.println("Actual result: " + actualResult);
            System.out.println("Expected result: " + expectedResult);
        }
    }
}
