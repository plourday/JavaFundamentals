package com.andrew.codingpractice.section_3_4;

public class Main
{

	public static void main(String[] args)
	{
		// Generates an integer 1-12 and prints the corresponding month.
		// Random month
		// Random int generation number 1 - 12
		// corresponding month name displays with the number

		double month = Math.max(1, (int) (Math.random() * 13));

		switch ((int) month)
		{
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
			default:
				System.out.println("Error : invalid status");
				System.exit(0);
		}
	}
}
