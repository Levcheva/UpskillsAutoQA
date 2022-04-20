package com.lecture4;

public class LargestNumber {
    public static void main(String[] args) {
        //an array
        int[] arr = {15, 66, 91, 90, 62, 84};

        //initialize with smallest possible value
        int largest = Integer.MIN_VALUE;

        //find largest element of array
        int index = 0;
        while (index < arr.length) {
            //check if largest is smaller than element
            if (largest < arr[index]) {
                //update largest
                largest = arr[index];
            }
            index++;
        }

        System.out.println("The largest number is : " + largest);
    }
}

