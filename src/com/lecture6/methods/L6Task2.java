package com.lecture6.methods;

public class L6Task2 {
    public static void main(String[] args) {

    double a = 75;
    double b = 45;
    double c = 21;

    System.out.print("The average value of the three numbers is: " + average(a, b, c)+"\n" );
}

    public static double average(double a, double b, double c)
    {
        return (a + b + c) / 3;
    }
}
