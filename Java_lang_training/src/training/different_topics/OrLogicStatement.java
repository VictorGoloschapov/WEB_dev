package training.different_topics;

public class OrLogicStatement {
    public static void main(String[] args) {
        int score1 = 2;
        int score2 = 4;
        final int pass1 = 6;
        final int pass2 = 6;
        boolean needExamPass = (score1 >= pass1) || (score2 >= pass2);

        if((score1 >= pass1) || (score2 >= pass2)) {
            System.out.println("Один из этапов пройден");
            System.out.println("Требуется пересдача " + !needExamPass);
        } else {
            System.out.println("Оба этапа не пройдены");
            System.out.println("Требуется пересдача " + !needExamPass);
        }
    }
}
