package training;

import javax.swing.*;

public class UsingDoWhileDemo {
    //метод для определения бинарного кода
    static String coder(int number) {
        String s = "";//переменная для записи результата
        int n = number;

        do {
            s = (n % 2 ) + s;
            n /= 2;
        } while (n != 0);
        return s;
    }

    public static void main(String[] args) {
        String input;
        String title = "Вычисление бинарного кода";
        input = JOptionPane.showInputDialog(null, "Введите целое число", title, JOptionPane.QUESTION_MESSAGE);
        //проверка. не ввел число
        if (input == null) {
            System.exit(0);
        }
        int num = Integer.parseInt(input);

        //вызов метода coder
        String code = coder(num);
        String text = "Вы ввели число: " + code;
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
