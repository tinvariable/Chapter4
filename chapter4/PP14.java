package chapter4;

public class PP14 
{

	public static void main(String[] args) 
	{
		final int FIRST = 1;
		final int SECOND = 2;
		final int THRID = 3;
		final int FOURTH = 4;
		final int FIFTH = 5;
		final int SIXTH = 6;
		final int SEVENTH = 7;
		final int EIGHTH = 8;
		final int NINTH = 9;
		final int TENTH = 10;
		final int ELEVENTH = 11;
		final int TWELFTH = 12;
		String first = "A Partridge in a Pear Tree";
		String second = "2 Turtle Doves";
		String thrid = "3 French Hens";
		String fourth = "4 Calling Birds";
		String fifth = "5 Golden Rings";
		String sixth = "6 Geese a Laying";
		String seventh = "7 Swans a Swimming";
		String eighth = "8 Maids a Milking";
		String ninth = "9 Ladies Dancing";
		String tenth = "10 Lords a Leaping";
		String eleventh = "11 Pipers Piping";
		String twelfth = "12 Drummers Drumming";
		for (int day = 1; day <= 12; day++)
		{
			switch(day)
			{
			case FIRST:
				System.out.println("On the first day of Christmas my true love sent to me: A Partridge in a Pear Tree");
			case SECOND:
				System.out.println("On the second day of Christmas my true love sent to me: 2 Turtle Doves \n" +first);
			case THRID:
				System.out.println("On the third day of Christmas my true love sent to me: 3 French Hens\n" +second+ "\n"+first);
			case FOURTH:
				System.out.println("On the fourth day of Christmas my true love sent to me: 4 Calling Birds\n" +thrid+ "\n" +second+ "\n" +first);
			case FIFTH:
				System.out.println("On the fifth day of Christmas my true love sent to me: 5 Golden Rings\n" +fourth+ "\n" +thrid+ "\n" +second+ "\n" +first );
			case SIXTH:
				System.out.println("On the sixth day of Christmas my true love sent to me: 6 Geese a Laying\n" +fifth+ "\n" +fourth+ "\n" +thrid+ "\n" +second+ "\n" +first);
			case SEVENTH:
				System.out.println("On the seventh day of Christmas my true love sent to me: 7 Swans a Swimming\n" +sixth+ "\n" +fifth+ "\n" +fourth+ "\n" +thrid+ "\n" +second+ "\n" +first);
			case EIGHTH:
				System.out.println("On the eleventh day of Christmas my true love sent to me: 11 Pipers Piping\n" +seventh+ "\n" +sixth+ "\n" +fifth+ "\n" +fourth+ "\n" +thrid+ "\n" +second+ "\n" +first);
			case NINTH:
				System.out.println("On the ninth day of Christmas my true love sent to me: 9 Ladies Dancing\n" +eighth+ "\n" +seventh+ "\n" +sixth+ "\n" +fifth+ "\n" +fourth+ "\n" +thrid+ "\n" +second+ "\n" +first);
			case TENTH:
				System.out.println("On the tenth day of Christmas my true love sent to me: 10 Lords a Leaping\n" +ninth+ "\n" +eighth+ "\n" +seventh+ "\n" +sixth+ "\n" +fifth+ "\n" +fourth+ "\n" +thrid+ "\n" +second+ "\n" +first );
			case ELEVENTH:
				System.out.println("On the eleventh day of Christmas my true love sent to me: 11 Pipers Piping\n" +tenth+ "\n" +ninth+ "\n" +eighth+ "\n" +seventh+ "\n" +sixth+ "\n" +fifth+ "\n" +fourth+ "\n" +thrid+ "\n" +second+ "\n" +first);
			case TWELFTH:
				System.out.println("On the first day of Christmas my true love sent to me: 12 Drummers Drumming\n"+eleventh+"\n"+tenth+ "\n" +ninth+ "\n" +eighth+ "\n" +seventh+ "\n" +sixth+ "\n" +fifth+ "\n" +fourth+ "\n" +thrid+ "\n" +second+ "\n" +first);
			}
			
		}
			

	}

}
