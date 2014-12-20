package chapter4;

public class PP10c 
{

	public static void main(String[] args) 
	{
		final int MAX = 10;
		
		for (int row = 1; row <= MAX; row++)
		{
			for (int star = 10; star >= row; star--)
			System.out.print("*");
			System.out.println();
			
		}
		

	}

}
