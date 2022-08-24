package training.level_2.Task_9;

public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWednesday();
        test.shouldReturnThursday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();
        test.shouldReturnCorrectDayNumber();
    }
    public void shouldReturnMonday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(1);
        String correctDay = "Monday";
        checkTestResult(correctDay.equals(dayOfTheWeek), "Monday");
    }
    public void shouldReturnTuesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(2);
        String correctDay = "Tuesday";
        checkTestResult(correctDay.equals(dayOfTheWeek), "Tuesday");
    }
    public void shouldReturnWednesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(3);
        String correctDay = "Wednesday";
        checkTestResult(correctDay.equals(dayOfTheWeek), "Wednesday");
    }
    public void shouldReturnThursday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(4);
        String correctDay = "Thursday";
        checkTestResult(correctDay.equals(dayOfTheWeek), "Thursday");
    }
    public void shouldReturnFriday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(5);
        String correctDay = "Friday";
        checkTestResult(correctDay.equals(dayOfTheWeek), "Friday");
    }
    public void shouldReturnSaturday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(6);
        String correctDay = "Saturday";
        checkTestResult(correctDay.equals(dayOfTheWeek), "Saturday");
    }
    public void shouldReturnSunday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(7);
        String correctDay = "Sunday";
        checkTestResult(correctDay.equals(dayOfTheWeek), "Sunday");
    }
    public void shouldReturnCorrectDayNumber() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = 8;
        checkDayNumber(dayNumber);
    }
    private void checkTestResult(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
    private void checkDayNumber(int dayNumber) {
        if (dayNumber > 0 && dayNumber < 8) {
            System.out.println("Day number: " + dayNumber + " = OK");
        } else {
            System.out.println("Day number: " + dayNumber + " = Not correct day number");
        }
    }
}
