package com.andrew.codingpractice.section_3_8;

import java.util.Scanner;

public class Main
{
//sort numbers in descending order
	public static void main(String[] args)
	{
		int number1;
		int number2;
		int number3;

		int temp1;
		int temp2;
		int temp3;

		System.out.println("Please enter three integers separated by spaces.");
		try
		{
			Scanner scanner = new Scanner(System.in);

			number1 = scanner.nextInt();
			number2 = scanner.nextInt();
			number3 = scanner.nextInt();

			scanner.close();

			if (number1 > number2 && number1 > number3)
			{
				temp1 = number1;

				if (number2 > number3)
				{
					temp2 = number2;
					temp3 = number3;
				}
				else
				{
					temp2 = number3;
					temp3 = number2;
				}
			}
			else if (number1 > number2)
			{
				temp2 = number1;
				temp3 = number2;
				temp1 = number3;
			}
			else
			{
				temp3 = number1;

				if (number2 > number3)
				{
					temp1 = number2;
					temp2 = number3;
				}
				else
				{
					temp1 = number3;
					temp2 = number2;
				}
			}

			System.out.println(temp1);
			System.out.println(temp2);
			System.out.println(temp3);

		}
		catch (Exception e)
		{
			System.out.println("Please enter integers.");
			System.exit(0);
		}
	}
}
