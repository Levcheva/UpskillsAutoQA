package com.lecture7.constructors.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleExceptions {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int myInt1, myInt2 ;
        System.out.println("Enter int1: ");
        if (myScanner.hasNextInt()) {
            myInt1 = myScanner.nextInt();
        }
        else {
            throw new IllegalArgumentException("Input must be an int value!");
        }

        System.out.println("Enter int2: ");
        myInt2 = myScanner.nextInt();


        // try catch for dividing by zero

        int y;
        try
        {
            y = myScanner.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("You have to enter a number.");
        }


        try {
            System.out.println("myInt1 / myInt2 = " + myInt1 / myInt2);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Some code here ..");
    }
}
