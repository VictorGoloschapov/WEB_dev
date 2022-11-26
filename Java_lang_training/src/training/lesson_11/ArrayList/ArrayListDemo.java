package training.lesson_11.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> scaryStories = new ArrayList<>();
        scaryStories.add("Your browser history is public");
        scaryStories.add("You didn't kill that spider");

        for (String story: scaryStories) {
            System.out.println(story);
        }
    }
}
