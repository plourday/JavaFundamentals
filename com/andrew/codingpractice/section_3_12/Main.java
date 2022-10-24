package com.andrew.codingpractice.section_3_12;

import java.util.Scanner;

public class Main
{
	// Program prompts user to enter a three-digit integer and determines if it is a
	// palindrome integer.
	// An integer is palindrome if it is the same when read left to right and right
	// to left.
	public static void main(String[] args)
	{
		int palindrome;

		System.out.println("Please enter a three-digit integer. I.E 123");

		try
		{
			Scanner scanner = new Scanner(System.in);
			palindrome = scanner.nextInt();
			scanner.close();

			if ((palindrome % 10) == (palindrome / 100))
			{
				System.out.println(palindrome + " is a palindrome.");
			}
			else
			{
				System.out.println(palindrome + " is not a palindrome.");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
