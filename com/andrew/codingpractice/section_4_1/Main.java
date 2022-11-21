package com.andrew.codingpractice.section_4_1;

import java.util.Scanner;

public class Main
{
	/*
	 * The formula for computing the area of a pentagon is Area = 5 * s^2 / 4 *
	 * tan(pi/5) where s is the length of a side. The formula s = 2r sing(pi/5)
	 * where r is the length from the center of the pentagon to a vertex. Round up
	 * two digits after the decimal point.
	 * 
	 */
	public static void main(String[] args)
	{
		double radius = 0;
		double side = 0;
		double area = 0;

		try
		{
			System.out.println("Enter the length from the center to a vertex.");
			
			Scanner scanner = new Scanner(System.in);

			radius = scanner.nextDouble();

			scanner.close();

			if (radius <= 0)
			{
				throw new Exception();
			}
		}
		catch (Exception e)
		{
			System.out.println("Invalid input");
			e.printStackTrace();
		}

		side = (2 * radius) * (Math.sin(Math.PI / 5));

		area = (5 * (Math.pow(side, 2))) / (4 * (Math.tan(Math.PI / 5)));

		System.out.println("The are of the Pentagon is " + Math.round(area * 100) / 100.0);
		
		System.exit(0);

	}
}
