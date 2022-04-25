package com.lecture6.methods;

public class L6Task4 {
    public static void main(String[] args) {
        int number = 5;
        isEven(number);
    }


    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            // If remainder is zero then this number is even.
            System.out.println("Entered Number is Even");
        }
        else {
            // If remainder is not zero then this number is odd.
            System.out.println("Entered Number is Odd");
        }
        return false;
    }

}
