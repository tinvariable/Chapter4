package chapter4;
import java.util.Scanner;

public class Age 
{

	public static void main(String[] args) 
	{
		final int MINOR = 21;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		
		System.out.println("You entered: " + age);
		
		if (age < MINOR)
		{
			System.out.println("Youth is a wonderful thing. Enjoy.");
			
		}
		if (age > MINOR)
		{
			System.out.println("Age is a state of mind");
		}

	}

}
