package chapter4;

public class PP11 
{

	public static void main(String[] args) 
	{
		final int MIN = 32;
		final int MAX = 126;
		final int PER_LINE = 5;
		int count = 0;
		
		for (int chValue = MIN; chValue <= MAX; chValue++)
		{
			System.out.println(chValue + " " + (char)chValue+ "\t");
			count++;
			if (count % PER_LINE == 0)
				System.out.println();
		}
		

	}

}
