package training.different_topics;

public class MultiDimentionalArrays {
    public static void main(String[] args) {
        int[][] grid = {
                {2, 34, 5},
                {5, 10},
                {1}
        };

        for (int row = 0; row < grid.length; row++) {
            System.out.println(grid[row]);//Выведем каждый элемент массива. row ==> один элемент
        }
        System.out.println("=============");
        for (int row = 0; row < grid.length; row++) {//перебираем элементы в основном массиве
            for (int col = 0; col < grid[row].length; col++) {//перебираем элементы во вложенном массиве
                System.out.print(grid[row][col] + "\t");
                //за одну итерацию row ==> перебираем весь вложенный массив col
                //grid.length - длина основного массива
                //row - ячейка главного массива
                //col < grid[row].length - ячейка col вложенного массива меньше длины вложенного массива grid[row]
            }
            System.out.println();
        }
    }
}


