package training.different_topics;

public class LogicOperators {
    public static void main(String[] args) {
        boolean a;
        boolean b;
        boolean c;
        boolean d;

        a = true;
        b = true;
        c = a && b;
        d = a || b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("&& result 1: " + c);
        System.out.println("|| result 1: " + d);
        System.out.println("/--------------*/");

        a = false;
        b = false;
        c = a && b;
        d = a || b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("&& result 2: " + c);
        System.out.println("|| result 2: " + d);
        System.out.println("/--------------*/");

        a = true;
        b = false;
        c = a && b;
        d = a || b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("&& result 3: " + c);
        System.out.println("|| result 3: " + d);
        System.out.println("/--------------*/");

        a = false;
        b = true;
        c = a && b;
        d = a || b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("&& result 4: " + c);
        System.out.println("|| result 4: " + d);
    }
}
