package chapter4;
import java.util.Random;
import java.util.Scanner;

public class PP13 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		final int ROCK = 1, SCISSOR = 2, PAPER = 3;
		int computer;
		int guess;
		computer = rand.nextInt(3)+1;
		
		System.out.println("Enter 1 for Scissors, 2 for Paper, or 3 for Rock");
		guess = scan.nextInt();
		System.out.println(computer);
		
		if (guess == computer)
		{
			System.out.println("It is a tie");
		}
		else
		{
			switch(guess)
			{
			case ROCK:
				if (computer == SCISSOR)
					System.out.println("You Win");
				else 
					System.out.println("You Lose");
				break;
			case SCISSOR:
				if (computer == PAPER)
					System.out.println("You Win");
				else
					System.out.println("You Lose");
				break;
			case PAPER:
				if (computer == ROCK)
					System.out.println("You Win");
				else
					System.out.println("You Lose");
				break;
			}
		}
		

	}

}
