package training.lesson_14.lesson_code.lambda;

public class CheckerImp implements Checker {
    @Override
    public boolean test(Animal a) {
        return a.isCanHop();
    }
}
