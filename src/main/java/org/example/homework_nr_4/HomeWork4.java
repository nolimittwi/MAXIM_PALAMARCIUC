package org.example.homework_nr_4;

public class HomeWork4 {
    public static void main(String[] args) {

        int[] array = new int[] {0, 1, 2, 3, 4, 5};
        for (int index = 0; index != array.length; index++)
            System.out.print(array[index]);

        int sum = 0;
        for (int x = 0; x != array.length; x++)
            sum += array[x];

        System.out.println();

        System.out.println("Сумма количества элементов одномерного массива = " + sum);

        float average = sum / array.length;

        System.out.println("Среднее значение = " + average);

        System.out.println();

        System.out.println("==============================");

        int[][] DoubleArray = new int[][]{
                {0, 2, 4, 6, 8, 10},
                {1, 3, 5, 7, 9}
        };

        int count = 0;
        for (int x = 0; x != DoubleArray.length; x++){
            for (int y = 0; y != DoubleArray[x].length; y++){
                if (DoubleArray[x][y] % 2 !=0){
                    count++;
                }
            }
        }

        System.out.println("Нечетные числа = " + count);

        int count1 = 0;
        for (int x = 0; x != DoubleArray.length; x++){
            for (int y = 0; y != DoubleArray[x].length; y++){
                if (DoubleArray[x][y] % 2 ==0){
                    count1++;
                }
            }
        }

        System.out.println("Четные числа = " + count1);

        System.out.println("==============================");
    }
}