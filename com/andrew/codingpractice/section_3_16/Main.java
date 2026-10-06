package com.andrew.codingpractice.section_3_16;

/*
* Write a program that displays a random coordinate in a rectangle. 
* The rectangle is centered at (0,0) with a width of 100 and a height of 200.
*/

public class Main {

        public static void main(String[] args) {
                double x = (int) (Math.random() * 100) - 50;
                double y = (int) (Math.random() * 200) - 100;
                System.out.println("Random coordinate in the rectangle: (" + x + ", " + y + ")");
        }

}
