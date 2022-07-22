package training;

public class WorkWithArrays {
    public static void main(String[] args) {
        double[] myArray = {0.1, 0.3, 1.5, 2.5, 3.4};

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        double total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
            System.out.println(total);
        }
        double max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println(max);
    }
}
