package training.lesson_12;

import java.io.IOException;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            if(x != 0) {
                throw new IOException("IOException shown because should enter only zero!");
            }
        }
    }
}
