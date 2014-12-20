package chapter4;
import java.util.Scanner;
public class PP41 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int year;
		
		System.out.println("Enter year: ");
		year = scan.nextInt();
		boolean leap = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		if (year < 1582)
			System.out.println("Error : not valid in Gregorian calendar");
		if (leap)
		{
			System.out.println(year + " is a leap year.");
		}
		else
		{
			System.out.println(year + " is not a leap year.");
		}
		
		
		

	}

}
