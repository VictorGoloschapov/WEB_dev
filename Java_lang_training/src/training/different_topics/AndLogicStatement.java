package training.different_topics;

public class AndLogicStatement {
    public static void main(String[] args) {
        int score1 = 4;
        int score2 = 8;
        final int pass1 = 6;
        final int pass2 = 6;

        if((score1 >= pass1) && (score2 >= pass2)) {
            System.out.println("Оба этапа пройдены");
        } else {
            System.out.println("Один из этапов не пройден");
            boolean passTrueFalse = (score1 >= pass1) && (score2 >= pass2);
            System.out.println("Нужна пересдача: " + !passTrueFalse);
        }
    }
}
