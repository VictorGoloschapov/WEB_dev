package training.different_topics;

public class Arrays {
    public static void main(String[] args) {
        //define array
        //using word new
        int[] myList = new int[5];
        myList[0] = 1;
        myList[1] = 2;
        myList[2] = 3;
        myList[3] = 4;
        myList[4] = 5;

        System.out.println(myList[1]);

        //manual creation
        String[] myStringList = {"a", "ab", "c"};

        System.out.println(myStringList[2]);
        for (int i = 0; i < myStringList.length; i++) {
            System.out.println(myStringList[i]);
        }
        //array length
        int arrayLength = myList.length;
        System.out.println("myList length: " + arrayLength);

        //array element change
        myList[0] = 8;
        System.out.println(myList[0]);

        //various levels array
        int[][] numList = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(numList[0][2]);
        for (int i = 0; i < numList.length; i++) {
            for (int j = 0; j < numList[i].length; j++ ) {
                System.out.println(numList[i][j]);
                //i переберет все елементы первого уровня
                //j переберет элементы вложенных массивов
            }
        }
    }
}
