package training.lesson_11.Lists;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Horse");
        animals.add("Dog");
        animals.add("Dinosaur");

        //for (String animal : animals) {
            //System.out.println(animal );
        //}

        animals.remove("Cat");
        System.out.println(animals);

        System.out.println(animals.indexOf("Horse"));
    }
}
