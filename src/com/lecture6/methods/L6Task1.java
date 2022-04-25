package com.lecture6.methods;

import java.util.Scanner;

public class L6Task1 {
    public static void main(String[] args) {
        double x = 4;
        double y = 50;
        double z = 12;
        System.out.print("The smallest of the three numbers " + smallest(x, y, z) + "\n");
    }

    public static double smallest(double x, double y, double z) {
        return Math.min(Math.min(x, y), z);
    }

}