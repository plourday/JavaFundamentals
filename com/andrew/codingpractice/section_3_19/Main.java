package com.andrew.codingpractice.section_3_19;

import java.util.Scanner;

/* 
* Compute the perimeter of a triangle. Write a program that reads three edges for a triangle and computes the perimeter if the input is valid.
* Otherwise, disaply that the input is invalid. The input is valid of the sum of every pair of two edges is greater that the remaining edge.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first edge of the triangle:");
        double edge1 = scanner.nextDouble();
        System.out.println("Enter the second edge of the triangle:");
        double edge2 = scanner.nextDouble();
        System.out.println("Enter the third edge of the triangle:");
        double edge3 = scanner.nextDouble();
        scanner.close();
        double perimeter = edge1 + edge2 + edge3;
        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1)
            System.out.println(
                    "The perimeter of a triangle with three edges being " + edge1 + ", " + edge2 + ", and " + edge3
                            + " is " + perimeter);
        else {
            System.out.println("Input is invalid.");
        }
    }
}
