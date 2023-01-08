package training.lesson_12;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        try {
            shouldThrowException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }

    public static void shouldThrowException() throws Exception {
        throw new Exception("My test checked exception was thrown");
    }

}
