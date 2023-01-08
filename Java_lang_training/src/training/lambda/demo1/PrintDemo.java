package training.lambda.demo1;

public class PrintDemo {
    public static void main(String args[]) {
        Printable printer = s -> System.out.println(s);
        printer.print("Some text");
    }
}
