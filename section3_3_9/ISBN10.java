package section3_3_9;
import java.util.Scanner;

public class ISBN10 {

	public static void main(String[] args) {
		
		/*Formula for checksum
		 * (d1 * 1 + d2 * 2 + ... + d9 * 9 ) % 11
		 * if the checksum is 10 the last number is denoted by X according to the ISBN convention  
		*/
		
		int isbn;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first nine didgits of the ISBN number");
		isbn = scan.nextInt();
		scan.close();
		
		int d1 = isbn % 10;
		int d2 = (isbn % 100) / 10;
		int d3 = (isbn % 1000) / 100;
		int d4 = (isbn % 10000) / 1000;
		int d5 = (isbn % 100000) / 10000;
		int d6 = (isbn % 1000000) / 100000;
		int d7 = (isbn % 10000000) / 1000000;
		int d8 = (isbn % 100000000) / 10000000;
		int d9 = (isbn % 1000000000) / 100000000;
		
		int checksum = ((d9 * 1) + (d8 * 2) + (d7 * 3) + (d6 * 4) + (d5 * 5) + (d4 * 6) + (d3 * 7) + (d2 * 8) + (d1 * 9)) % 11;
		
		
		if(checksum == 10) 
		{
			System.out.print(d9);
			System.out.print(d8);
			System.out.print(d7);
			System.out.print(d6);
			System.out.print(d5);
			System.out.print(d4);
			System.out.print(d3);
			System.out.print(d2);
			System.out.print(d1);
			System.out.print("X");
		}
		else 
		{
			System.out.print(d9);
			System.out.print(d8);
			System.out.print(d7);
			System.out.print(d6);
			System.out.print(d5);
			System.out.print(d4);
			System.out.print(d3);
			System.out.print(d2);
			System.out.print(d1);
			System.out.println(checksum);
		}	
	}

}
