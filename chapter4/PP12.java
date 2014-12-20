package chapter4;
import java.util.Scanner;
public class PP12 
{

	public static void main(String[] args) 
	{
		int a =0, e = 0, x = 0;
	    int u = 0, o = 0, other = 0;
	    String input;
	    Scanner scan = new Scanner(System.in);


	    System.out.print("enter string: ");
	    input = scan.nextLine();

	    for (int i = 0; i < input.length(); i++) 
	    {
	    char c = input.charAt(i);

	    if (c=='a')
	    a++; 

	    else if( c=='e')
	    e++;

	    else if(c=='i')
	    x++;

	    else if(c=='o')
	    o++;

	    else if (c=='u')
	    u++;        

	    else
	    other++;
	    }

	    System.out.println("a: " + a + "\n" + "e: " + e + "\n" + "i: " + x + "\n" + "o: " + o + "\n" + "u: " + u + "\n" + "other: " + other);


	}

}
