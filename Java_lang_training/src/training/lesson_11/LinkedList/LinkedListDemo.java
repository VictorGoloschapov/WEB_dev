package training.lesson_11.LinkedList;

import java.util.List;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> things = new LinkedList<>();
        things.add("Computer");
        things.add("Coffee");
        things.add("Tea");

        for (String thing : things) {
            System.out.println(thing);
        }
    }
}
