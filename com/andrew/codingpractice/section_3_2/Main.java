package com.andrew.codingpractice.section_3_2;

import java.util.Scanner;

public class Main
{
	// Prompt user to add 3 single-digit integers together.
	public static void main(String[] args)
	{
		double number1 = (int) (Math.random() * 10);
		double number2 = (int) (Math.random() * 10);
		double number3 = (int) (Math.random() * 10);
		double answer = number1 + number2 + number3;
		double input;

		System.out.println("Enter the answer to");
		System.out.println(number1 + " + " + number2 + " + " + number3);

		Scanner scan = new Scanner(System.in);

		input = scan.nextInt();

		scan.close();

		if (answer == input)
		{
			System.out.println("Correct!");
			System.exit(0);
		}
		else
		{
			System.out.println("Incorrect!");
			System.out.println("Answer is " + answer);
			System.out.println("Try again.");
			System.exit(0);
		}
	}
}
