package com.lecture6.methods;

public class L6Task3 {
    public static void main(String[] args) {
        String myString = "12345678";

        int length = myString.length();

        if (length % 2 == 0) {
            System.out.println(myString.charAt(length / 2));
            System.out.println(myString.charAt((length / 2) - 1));
        }
        else {
            System.out.println(myString.charAt(length / 2));
        }
   }

}
