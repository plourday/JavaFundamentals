package com.andrew.codingpractice.section_3_18;

import java.util.Scanner;

/*
* c(w) = 3.5, if 0 < w <= 1 
*        5.5, if 1  < w <= 3
*        8.5, if 3 < w <= 10
*        10.5, if w > 10 <= 20
*  Write a program that prompts the user to enter the weight of a package and display the 
*  shipping cost based on the forumla above.
*  If the weight is negative or 0 return "Invalid input"
*  If the weight is greater than 20 return "The package cannot be shipped."
*/

public class Main {

        public static void main(String[] args) {
                double packageWeight;

                System.out.println("Please enter the weight of the package.");
                Scanner scanner = new Scanner(System.in);
                packageWeight = scanner.nextDouble();
                scanner.close();
                if (packageWeight > 20) {
                        System.out.println("The package cannot be shipped.");
                } else if (packageWeight > 0 && packageWeight <= 1) {
                        System.out.println("Shipping cost: $3.50");
                } else if (packageWeight > 1 && packageWeight <= 3) {
                        System.out.println("Shipping cost: $5.50");
                } else if (packageWeight > 3 && packageWeight <= 10) {
                        System.out.println("Shipping cost: $8.50");
                } else if (packageWeight > 10 && packageWeight <= 20) {
                        System.out.println("Shipping cost: $10.50");
                } else {
                        System.out.println("Invalid input");
                }
                System.exit(0);
        }
}
