package com.lecture5.datastructures;

public class LecFiveTaskSix {

    public static void main(String[] args) {


        int i, sum = 0;

        int[][] array = {{10, 20, 30, 60}, {70, 44, 80, 90}};

        for(i = 0; i < array.length ; i++)
        {
            System.out.format("\nThe Matrix Item at " + i + "," + i +
                    " position = " + array[i][i]);
            sum = sum + array[i][i];
        }
        System.out.println("\nThe Sum of the Matrix Diagonal Items = " + sum);

    }
}
