package training.lesson_12;

import java.util.*;

public class NpeTest {
    //NPE = nullPointerException
    public static void main(String[] args) {
        NpeTest npeTest = new NpeTest();
        List<String> textList = new ArrayList<>();
        textList.add("First word");
        textList.add("Second word");
        textList.add("Third word");
        textList.add(null);

        for(String elem : textList) {
            try {
                npeTest.print(elem);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("exception was handled");
                e.printStackTrace();
            } finally {
                System.out.println("inside block finally");
            }
            System.out.println("/=====================/");

        }
    }

    public void print(String text) {
        if (text == null) {
            throw new NullPointerException("NPE was thrown");
        }
        System.out.println("Inside of print method: " + text);
    }
}
