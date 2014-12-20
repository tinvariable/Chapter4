package chapter4;
import java.util.Scanner;
import java.util.Random;

public class PP48 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int guess;
		int num;
		boolean response;
		
		num = rand.nextInt(101);
		while (true)
		{
		System.out.println("Enter a number between 0 and 100");
		guess = scan.nextInt();
		if (guess < num)
			System.out.println("You are too low");
		else
			System.out.println("You are too high");
		if (guess == num)
			System.out.println("Correct");
		}
		
		
		

	}

}
