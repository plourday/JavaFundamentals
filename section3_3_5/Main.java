package section3_3_5;

import java.util.Scanner;

public class Main 
{
	
	public static void main(String[] args) 
	{
		
		int day_Number;
		int days_elapsed;
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter today's day in numerical form. (1=Monday, 7=Saturday)");
		
		day_Number = scan.nextInt();
		System.out.println("Please enter the number of days that have elapsed since today: ");
		days_elapsed = scan.nextInt();
		scan.close();
		
		
		
		int future_day_number = (day_Number + days_elapsed) % 7; 
		
		switch (day_Number) 
		{
		case 1:  System.out.print("Today is Monday and the future day is ");
			break;
		case 2: System.out.print("Today is Tuesday and the future day is ");
			break;
		case 3: System.out.print("Today is Wednesday and the future day is ");
			break;
		case 4: System.out.print("Today is Thursday and the future day is ");
			break;
		case 5: System.out.print("Today is Friday and the future day is ");
			break;
		case 6: System.out.print("Today is Saturday and the future day is ");
			break;
		case 7: System.out.print("Today is Sunday and the future day is ");
			break;
		
		}
		
		switch (future_day_number) 
		{
		case 1:  System.out.print("Monday.");
			break;
		case 2: System.out.print("Tuesday.");
			break;
		case 3: System.out.print("Wednesday.");
			break;
		case 4: System.out.print("Thursday.");
			break;
		case 5: System.out.print("Friday.");
			break;
		case 6: System.out.print("Saturday.");
			break;
		case 7: System.out.print("Sunday.");
			break;
		
		}
		
		System.exit(0);
	}

}
