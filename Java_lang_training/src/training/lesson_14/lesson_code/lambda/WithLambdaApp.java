package training.lesson_14.lesson_code.lambda;

import java.util.ArrayList;
import java.util.List;

public class WithLambdaApp {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("tiger", true, true));
        animals.add(new Animal("turtle", false, true));

        print(animals, Animal::isCanHop);
        print(animals, a -> a.isCanSwim()); // same as Animal::isCanSwim
    }

    private static void print(List<Animal> animals, Checker checker) {
        for (Animal animal: animals) {
            if(checker.test(animal)) {
                System.out.println(animal + "");
            }
        }
    }
}
