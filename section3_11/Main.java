package com.andrew.codingpractice.section03.section3_11;

import java.util.Scanner;

//find number of days in a month
/*
 * 
 * 
 * */
public class Main
{

	public static void main(String[] args)
	{
		int year;
		int month;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the year");
		year = scan.nextInt();
		System.out.println("Please enter the month.");
		month = scan.nextInt();
		scan.close();

		switch (month)
		{
			case 1:
				System.out.println("Month: January" + " Year: " + year + " Days:31");
				break;

			case 2:

				if (year % 4 == 0)
				{
					System.out.println("Month: February" + " Year: " + year + " Days:29");
				}
				else
				{
					System.out.println("Month: February" + " Year: " + year + " Days:28");
				}
				break;

			case 3:
				System.out.println("Month: March" + " Year: " + year + " Days:31");
				break;

			case 4:
				System.out.println("Month: April" + " Year: " + year + " Days:30");
				break;

			case 5:
				System.out.println("Month: May" + " Year: " + year + " Days:31");
				break;

			case 6:
				System.out.println("Month: June" + " Year: " + year + " Days:30");
				break;

			case 7:
				System.out.println("Month: July" + " Year: " + year + " Days:31");
				break;

			case 8:
				System.out.println("Month: August" + " Year: " + year + " Days:30");
				break;

			case 9:
				System.out.println("Month: September" + " Year: " + year + " Days:31");
				break;

			case 10:
				System.out.println("Month: October" + " Year: " + year + " Days:30");
				break;

			case 11:
				System.out.println("Month: November" + " Year: " + year + " Days:31");
				break;

			case 12:
				System.out.println("Month: December" + " Year: " + year + " Days:30");
				break;
		}
		System.exit(0);
	}
}
