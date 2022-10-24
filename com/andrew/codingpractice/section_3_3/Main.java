package com.andrew.codingpractice.section_3_3;

import java.util.Scanner;

public class Main
{
	// Solve 2x2 linear equations: Prompt user to enter double values a-f and print
	// the solution to the linear equation.
	public static void main(String[] args)
	{
		// pg 109
		// cramer's rule
		/*
		 * ax + by = e cx + dy = f
		 * 
		 * x = (ed-bf) / (ad-bc)
		 * 
		 * y = (af-ec) / (ad-bc)
		 * 
		 * if ad-bc = 0 There is no solution
		 * 
		 */

		double a, b, c, d, e, f;

		System.out.println("Please enter 6 values.");

		Scanner scan = new Scanner(System.in);

		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		d = scan.nextDouble();
		e = scan.nextDouble();
		f = scan.nextDouble();

		scan.close();

		double denominator = (a * d) - (b * c);
		double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

		if (denominator == 0)
		{
			System.out.println("There is no solution");
			System.exit(0);
		}
		else
		{
			System.out.println("x is " + x + "and y is " + y);
			System.exit(0);
		}
	}
}
