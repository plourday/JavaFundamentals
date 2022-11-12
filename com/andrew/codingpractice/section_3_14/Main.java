package com.andrew.codingpractice.section_3_14;

import java.util.Random;
import java.util.Scanner;

public class Main
{
	// Program that lets a user guess whether the flip of a coin is heads or tails.
	public static void main(String[] args)
	{

		int guess = -1;
		int answer = -1;

		Random random = new Random();

		answer = random.nextInt(2);
		System.out.println(answer);
		System.out.println("Heads or tails? (0 = Heads, 1 = Tails)");

		try
		{
			Scanner scan = new Scanner(System.in);

			guess = scan.nextInt();

			scan.close();
		}
		catch (Exception e)
		{
			System.out.println("Invalid input");
			e.printStackTrace();
			System.exit(0);
		}

		if (guess == 0 && answer == 0)
		{
			System.out.println("Heads! You win!");
		}
		else if (guess == 1 && answer == 0)
		{
			System.out.println("Heads! You lose!");
		}
		else if (guess == 1 && answer == 1)
		{
			System.out.println("Tails! You win!");
		}
		else
		{
			System.out.println("Tails! You Lose!");
		}
		System.exit(0);
	}

}
