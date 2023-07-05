import java.util.Scanner;

public class CellPhoneService 
{
	public static void main(String[] args)
	{
		Scanner object = new Scanner(System.in);
		
		System.out.println("What plan is right for you?");
		
		System.out.print("\nHow many minutes do you need for phone calls? ");
		int minutes = object.nextInt();
		
		System.out.print("How many text messages do you need to send? ");
		int texts = object.nextInt();
		
		System.out.print("How many gigabytes of data do you need? (numbers only) ");
		int data = object.nextInt();
		
		char plan = 'A';
		int cost = 0;
		
		if (minutes < 500 && texts == 0 && data == 0)
		{
			plan = 'A';
			cost = 49;
		}
		else if (minutes < 500 && texts > 0 && data == 0)
		{
			plan = 'B';
			cost = 55;
		}
		else if (minutes >= 500 && texts < 100 && data == 0)
		{
			plan = 'C';
			cost = 61;
		}
		else if (minutes >= 500 && texts >= 100 && data == 0)
		{
			plan = 'D';
			cost = 70;
		}
		else if (minutes > 0 && texts > 0 && data < 3)
		{
			plan = 'E';
			cost = 79;
		}
		else if (minutes > 0 && texts > 0 && data >= 3)
		{
			plan = 'F';
			cost = 87;
		}
		
		System.out.println("Based on the data you've entered, we suggest plan " + plan + " for $" + cost + " per month");
	}
}
