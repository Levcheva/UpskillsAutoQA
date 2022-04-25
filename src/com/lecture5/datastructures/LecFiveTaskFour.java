package com.lecture5.datastructures;

public class LecFiveTaskFour {
    static int arr[] = {1, 3, 4, 9, 8};

    static int largestNumber()
    {
        int i;

        // Initialize maximum element
        int max = arr[0];


        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    public static void main(String[] args)

    {
        System.out.println("The largest number in the given array is " + largestNumber());
    }
}
