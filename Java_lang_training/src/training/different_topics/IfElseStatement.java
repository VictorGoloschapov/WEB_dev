package training.different_topics;

public class IfElseStatement {
    public static void main(String[] args) {
        int x = 115;

        if(x < 20) {
            System.out.println("True output");
        } else {
            System.out.println("else code");
        }

        //if..else if...else
        if(x <  20) {
            System.out.println("Условие 1");
        } else if(x > 30 && x < 115) {
            System.out.println("Условие 2");
        } else if (x == 5) {
            System.out.println("Условие 3");
        } else {
            System.out.println("else");
        }
    }
}
