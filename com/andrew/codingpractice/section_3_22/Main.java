package com.andrew.codingpractice.section_3_22;

/*
*Prompt the user to enter a point (x,y) and then check whether the point is inside a circle centered at 0,0 with a radius of 10
*
*Distance formula : sqrt((x2-x1)^2 + (y2-y1)^2)
*
*
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double centerx = 0;
        final double centery = 0;
        final double radius = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the x and y coordinate.");
        double xcoord = scanner.nextDouble();
        double ycoord = scanner.nextDouble();
        scanner.close();

        double distance = Math.sqrt(Math.pow((xcoord - centerx), 2) + Math.pow((ycoord - centery), 2));

        if (distance > radius) {
            System.out.println("The point " + xcoord + " " + ycoord + " is outside the circle.");
        } else {
            System.out.println("The point " + xcoord + " " + ycoord + " is inside the circle.");
        }

    }
}
