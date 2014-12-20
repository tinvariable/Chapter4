package chapter4;
import java.util.Scanner;
public class PP42 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int year;
		boolean answer;
		leapyear();
		System.out.println("Would you like to enter another year? (True of False)");
		answer = scan.nextBoolean();
		
		
		if (answer != false)
		{
			leapyear();
		}
		
			
	}

	public static void leapyear() 
	{
		Scanner scan = new Scanner(System.in);
		int year;
		boolean answer;
		System.out.println("Enter year: ");
		year = scan.nextInt();
		boolean leap = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
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
