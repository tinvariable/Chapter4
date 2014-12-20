package chapter4;
import java.util.Scanner;

public class PP45 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
        int value;
        int even = 0, odd = 0, zero = 0;

        System.out.print("Enter an integer: ");
        value = scan.nextInt();

        while (value > 0) 
        {

            if ((value%10)==0) 
            {
               zero++;
            }
            else if (value%2==0) 
            { 
               even++;
            }
            else 
            { 
               odd++;
            }

            value /= 10;
        }
    System.out.println(); 
    System.out.printf("Even: %d Odd: %d Zero: %d", even, odd, zero);
		
		
		
	}

}
