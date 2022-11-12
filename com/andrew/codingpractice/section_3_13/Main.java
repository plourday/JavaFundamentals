package com.andrew.codingpractice.section_3_13;

import java.util.Scanner;

public class Main
{
// Compute taxes for all filing statuses as of the year 2009.
	public static void main(String[] args)
	{
		int status = -1;
		double income = -1;
		double tax = 0;

		System.out.println("0-single filer, 1-married jointly or "
				+ "qualifying widow(er), 2-married separately, 3-head of " + "household) Enter the filing");

		try
		{
			Scanner scan = new Scanner(System.in);
			status = scan.nextInt();

			System.out.println("Please enter the taxable income.");

			income = scan.nextDouble();

			scan.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		if (status == 0)
		{
			if (income <= 8350)
			{
				tax = income * 0.10;
			}
			else if (income <= 33950)
			{
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			}
			else if (income <= 82250)
			{
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
			}
			else if (income <= 171550)
			{
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			}
			else if (income <= 372950)
			{
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
						+ (income - 171550) * 0.33;
			}
			else
			{
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82550) * 0.28
						+ (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
			}

		}
		else if (status == 1)
		{
			if (income <= 16700)
			{
				tax = income * 0.10;
			}
			else if (income <= 67900)
			{
				tax = 16700 * 0.10 + (income - 16700) * 0.15;
			}
			else if (income <= 137050)
			{
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
			}
			else if (income <= 208850)
			{
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 208850) * 0.28;
			}
			else if (income <= 372950)
			{
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
						+ (income - 372950) * 0.33;
			}
			else
			{
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + ( 137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
						+ (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
			}
		}
		else if (status == 2)
		{
			if (income <= 8350)
			{
				tax = income * 0.10;
			}
			else if (income <= 33950)
			{
				tax = 8350 * 0.10 + (income - 33950) * 0.15;
			}
			else if (income <= 137050)
			{
				tax = 8350 * 0.10 + (68525 - 3395) * 0.15 + (income - 67900) * 0.25;
			}
			else if (income <= 208850)
			{
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 208850) * 0.28;
			}
			else if (income <= 372950)
			{
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
						+ (income - 372950) * 0.33;
			}
			else
			{
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + ( 137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
						+ (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
			}
		}
		else if (status == 3)
		{

		}
		else
		{
			System.out.println("Error: invalid status");
			System.exit(1);
		}

		System.out.println("Tax is " + (int) (tax * 100) / 100.0);
		System.exit(0);
	}
}
