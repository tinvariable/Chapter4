package chapter4;

public class PP10d 
{

	public static void main(String[] args) 
	{
	String star = "*********";
	String spaceD = "         ";
	
		for (int num = 4; num >= -4; num--)
			System.out.println(spaceD.substring(0, Math.abs(num))+star.substring(Math.abs(num), (9-Math.abs(num)))+spaceD.substring(Math.abs(9-Math.abs(num)), 9));
	
			
		

	}

}
