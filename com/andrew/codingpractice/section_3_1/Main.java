package com.andrew.codingpractice.section_3_1;

import java.util.Scanner;

public class Main
{
	/*
	 * Solve a quadratic equation Prompt user to enter 3 double values and determine
	 * the roots of the quadratic equation.
	 * 
	 * ax^2 + bx + c = 0 D = Discriminant: b^2 - 4ac if D is positive - two real
	 * roots if D is negative - no real roots if D is 0 - 1 real root write a
	 * program that determines the roots and then calculates them.
	 */
	public static void main(String[] args)
	{

		// First we need to determine the number of roots
		// sample: -10 , -9 , 1
		// roots are -1 and -1/10

		double a;
		double b;
		double c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a,b,c");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();

		scan.close();

		double discriminant = Math.pow(b, 2) - (4 * a * c);

		System.out.println("D = " + discriminant);

		double aroot = ((-1 * b) + (Math.pow(discriminant, 0.5))) / (2 * a);

		double broot = ((-1 * b) - (Math.pow(discriminant, 0.5))) / (2 * a);

		if (discriminant == 0)
		{
			System.out.print("The equation has 1 real root. ");
			System.out.print(aroot);
		}
		else if (discriminant < 0)

		{
			System.out.println("The equation has no real roots : ");
		}
		else
		{
			System.out.print("The equation has two real roots: ");
			System.out.print(aroot);
			System.out.print(", ");
			System.out.print(broot);
		}
	}
}
