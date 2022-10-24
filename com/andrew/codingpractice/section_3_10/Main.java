package com.andrew.codingpractice.section_3_10;

import java.util.Scanner;

public class Main
{
//Subtraction Quiz

	public static void main(String[] args)
	{
		// generate two random double-digit numbers
		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);
		int answer;
		// if number1 > number2, swap them

		if (number1 < number2)
		{
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}

		// prompt user to answer, "What is number1 - number2?"

		System.out.println("what is " + number1 + " - " + number2 + "?");

		try
		{
			Scanner scanner = new Scanner(System.in);

			answer = scanner.nextInt();

			if (answer == (number1 - number2))
			{
				System.out.println("Correct!");
			}
			else
			{
				System.out.println("Incorrect.");
				System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
			}
			scanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
