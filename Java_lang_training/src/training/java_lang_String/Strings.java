package training.java_lang_String;

import java.lang.String;
import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        //создание строки
        String newString = "Victor";
        System.out.println("origin string " + newString);

        //длина строки - метод length()
        int stringLength = newString.length();
        System.out.println("string length " + stringLength);

        //сложение строк
        String concatString = newString + " " + "Goloschapov";
        System.out.println("Concatenation " + concatString);

        //Перевод объекта/примитива в строку
        int number = 52;
        String a = String.valueOf(number);

        //Перевод строки в число
        String numberAsString = "123";
        Integer stringAsNumber = Integer.parseInt(numberAsString);

        //Метод charAt() — возвращает символ, расположенный по указанному индексу строки. Индексы строк в Java начинаются с нуля.
        char result = newString.charAt(2);
        System.out.println("result " + result);

        //Метод concat() — метод concat() в Java объединяет строки, путем добавления одной строки в конец к другой.
        String stringToAdd = " Goloschapov";
        String concatResult = newString.concat(stringToAdd);
        System.out.println("Concat result " + concatResult);

        //Метод indexOf() в Java имеет следующие варианты:
        //
        //public int indexOf(int ch) — возвращает индекс в данной строке первого вхождения указанного символа или -1, если символ не встречается.
        //public int indexOf(int ch, int fromIndex) — возвращает индекс в данной строке первого вхождения указанного символа, начиная поиск по указанному индексу, или значение -1, если символ не встречается.
        //int indexOf(String str) — возвращает индекс в данной строке первого вхождения указанной подстроки. Если эта подстрока не встречается, возвращается -1.
        //int indexOf(String str, int fromIndex) — возвращает индекс в данной строке первого вхождения указанной подстроки, начиная с указанного индекса. Если не встречается, возвращается -1.
        System.out.println(newString.indexOf("i"));
        System.out.println(newString.indexOf("o", 2));

        //Метод replace() — возвращает В Java новую строку, в результате, заменив все вхождения oldChar, в данной строке, на newChar,
        // другими словами — метод позволяет заменить символ в строке.
        String stringAfterReplace = newString.replace('r', 's');
        System.out.println("Result " + stringAfterReplace);

        //Метод replaceAll() — заменяет каждую подстроку данной строки, которая соответствует заданному регулярному выражению, с данной заменой,
        // другими словами — метод позволяет заменить слово в строке.
        String stringAfterReplaceAll = newString.replaceAll(newString, "сайт посвященный программированию!");
        System.out.println("Result " + stringAfterReplaceAll);

        //Метод split() — в Java разделяет данную строку вокруг данного регулярного выражения и имеет два варианта.
        String[] splitString = newString.split("");
        System.out.println("result " + Arrays.toString(splitString));
    }
}
