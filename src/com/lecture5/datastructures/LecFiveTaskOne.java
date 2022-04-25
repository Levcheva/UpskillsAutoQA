package com.lecture5.datastructures;

public class LecFiveTaskOne {
    public static void main(String[] args) {
        int[] array = {13, 2, 5, 3};

        int sum = 0; // initializing the sum;

        for (int i = 0; i < array.length; i++)  {
            sum += array[i];
        }
        System.out.println("The sum of the values of array elements is :" + sum);
    }
}
