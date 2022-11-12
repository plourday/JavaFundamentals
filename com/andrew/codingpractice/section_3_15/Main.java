package com.andrew.codingpractice.section_3_15;

import java.util.Scanner;

public class Main
{
	/*
	 * Prompts user to enter a three-digit integer and determines whether the user
	 * wins according to these rules. 1. If the input matches the lottery number in
	 * the exact order, the award is $10,000. 2. If all digits in the input matches
	 * the lottery number, the award is $3,000. 3. If one digit in the user input
	 * matches a digit in the lottery number, the award is $1,000.
	 */
	public static void main(String[] args)
	{

		int lottery = (int) (Math.random() * 1000);
		int guess = -1;

		System.out.println("Enter a three-digit integer to guess the winning lottery number.");
		try
		{
			Scanner scanner = new Scanner(System.in);
			guess = scanner.nextInt();
			scanner.close();

			if (guess > 999 || guess < 0)
			{
				throw new Exception();
			}

		}
		catch (Exception e)
		{
			System.out.println("invalid input.");
			e.printStackTrace();
			System.exit(0);
		}

		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = lottery % 100 / 10;
		int lotteryDigit3 = lottery % 100 % 10;

		int guessDigit1 = guess / 100;
		int guessDigit2 = guess % 100 / 10;
		int guessDigit3 = guess % 100 % 10;

		System.out.println("The lottery integer is " + lotteryDigit1 + "" + lotteryDigit2 + "" + lotteryDigit3);

		if (guess == lottery)
		{
			System.out.println("Exact Match: You win $10,000!");
		}
		else if ((guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2)
				|| (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3)
				|| (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2)
				|| (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1))
		{
			System.out.println("Matched all digits: You Win $3,000!");
		}
		else if ((guessDigit1 == lotteryDigit1) || (guessDigit1 == lotteryDigit2) || (guessDigit1 == lotteryDigit3)
				|| (guessDigit2 == lotteryDigit1) || (guessDigit2 == lotteryDigit2) || (guessDigit2 == lotteryDigit3)
				|| (guessDigit3 == lotteryDigit1) || (guessDigit3 == lotteryDigit2) || (guessDigit3 == lotteryDigit3))
		{
			System.out.println("Matched one digit: You win %1,000!");
		}
		else
		{
			System.out.println("No matches: Not a winner.");
		}
		System.exit(0);
	}
}
