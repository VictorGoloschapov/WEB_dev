package training.different_topics;

import javax.swing.JOptionPane;

public class UsingWhileDemo {

    static int decoder(String code) {
        int n = code.length();//количество символов в строке
        int s = 0;
        int k = 1;
        int q = 1;
        int a;

        while(k <= n) { //Проверяется символ в бинарном коде
            if(code.charAt(n - k) == '1') {
                a = 1;
            } else {
                a = 0;
            }
            s += q * a;
            q *= 2;
            k++;
        }
        return s;
    }

    public static void main(String[] args) {
        String input;
        String title = "Расшифровка бинарного кода";
        input = JOptionPane.showInputDialog(null, "Введите бинарный код", title, JOptionPane.QUESTION_MESSAGE);
        //проверка. если не ввел код
        if(input == null) {
            System.exit(0);
        }
        int num = decoder(input); // статический метод decoder()
        String text = "Вы ввели бинарный код" + input;
        text += "\nКод соответствует числу: " + num;

        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
