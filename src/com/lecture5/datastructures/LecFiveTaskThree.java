package com.lecture5.datastructures;

import java.util.Scanner;

public class LecFiveTaskThree {
    public static void main(String[] args) {
        int rows;
        int columns;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
//taking row as input
        rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
//taking column as input
        columns = sc.nextInt();
// Declaring the two-dimensional matrix
        int array[][] = new int[rows][columns];
// Read the matrix values
        System.out.println("Enter the elements of the array: ");
//loop for row
        for (int i = 0; i < rows; i++)
//inner for loop for column
            for (int j = 0; j < columns; j++)
                array[i][j] = sc.nextInt();
//accessing array elements
        System.out.println("Elements of the array are: ");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
//prints the array elements
                System.out.print(array[i][j] + " ");
//throws the cursor to the next line
            System.out.println();
        }
    }
}