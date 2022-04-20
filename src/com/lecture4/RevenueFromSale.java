package com.lecturefour;

import java.util.Scanner;

public class RevenueFromSale {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double unitPrice;
        int quantity;
        double discountRate;
        System.out.println("Please, enter unit price: ");
        unitPrice = myScanner.nextDouble();
        System.out.println("Please, enter quantity: ");
        quantity = myScanner.nextInt();

        if (quantity >=100 && quantity <=120 ) {
            discountRate = unitPrice*15/100;
            System.out.println("Discount rate is: " + discountRate + " $(15.0%)");
        }
        else if (quantity > 120) {
            discountRate = unitPrice*20/100;
            System.out.println("Discount rate is: " + discountRate + " $(20.0%)");
        }
        else {
            discountRate = 0;
            System.out.println("Sorry, there is no discount!");
        }
    }
}
