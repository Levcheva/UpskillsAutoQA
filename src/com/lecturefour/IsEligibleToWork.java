package LectureFour;

import java.util.Scanner;

public class IsEligibleToWork {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please, enter your age: ");
        int age = myScanner.nextInt();

        if (age >=16) {
            System.out.println("You are eligible to work.");
        }
        else {
            System.out.println("You are not eligible to work!");
        }



    }
}
