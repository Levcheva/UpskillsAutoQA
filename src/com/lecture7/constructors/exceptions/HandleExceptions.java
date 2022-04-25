package com.lecture7.constructors.exceptions;

public class HandleExceptions {

    public static void main(String[] args) {
        int myInt1 = 3;
        int myInt2 = 4;

        try {
            System.out.println(myInt1 / 0);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Some code here ..");
    }
}
