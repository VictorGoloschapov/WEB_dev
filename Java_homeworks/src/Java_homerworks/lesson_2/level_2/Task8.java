/*Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:

Hello имя пользователя!
*/


package Java_homerworks.lesson_2.level_2;
import java.util.Scanner;

public class Task8 {
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input your name: ");
        String name = input.nextLine();

        System.out.println("Hello " + name);
    }
}
