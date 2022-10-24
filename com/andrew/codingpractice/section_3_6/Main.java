package com.andrew.codingpractice.section_3_6;

import java.util.Scanner;

public class Main
{

	// Program prompts user for weight and height and displays their BMI and the
	// status example: Healthy or not healthy.

	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter weight in pounds");
		double weight = scan.nextDouble();

		System.out.println("Please enter height in feet adn inches I.E 6 2");
		double height_feet = scan.nextDouble();
		double height_inches = scan.nextDouble();
		scan.close();

		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;

		double height_total = height_inches + (height_feet * 12);

		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height_total * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);

		System.out.println("BMI is " + bmi + ":");
		if (bmi < 18.5)
		{
			System.out.println("Underweight");
		}
		else if (bmi < 25)
		{
			System.out.println("Normal");
		}
		else if (bmi < 30)
		{
			System.out.println("Overweight");
		}
		else
		{
			System.out.println("Obese");
		}
		System.exit(0);
	}
}
