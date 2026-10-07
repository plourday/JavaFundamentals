package com.andrew.codingpractice.section_3_23;
/*
*Prompt the user to enter a point (x,y) and then check whether the point is inside a rectangle centered at 0,0 with a width of 10 and a height of 5.
*
*
*
*
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final double centerx = 0;
        final double centery = 0;
        final double height = 5;
        final double width = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the x and y coordinate.");
        double xcoord = scanner.nextDouble();
        double ycoord = scanner.nextDouble();

        scanner.close();

        if (Math.abs(xcoord) > Math.abs(width / 2) || Math.abs(ycoord) > Math.abs(height / 2)) {
            System.out.println("The point " + xcoord + " " + ycoord + " is outside the rectangle.");
        } else {
            System.out.println("The point " + xcoord + " " + ycoord + " is inside the rectangle.");
        }
    }
}
