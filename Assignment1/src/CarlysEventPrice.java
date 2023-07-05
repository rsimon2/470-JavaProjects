import java.util.Scanner;

public class CarlysEventPrice 
{
	public static void main(String[] args)
	{
		double price = 35.00;
		
		System.out.println("*************************************************");
		System.out.println("* Carly’s makes the food that makes it a party. *");
		System.out.println("*************************************************\n");
		
		Scanner object = new Scanner(System.in);
		System.out.print("Enter the number of guests: ");
		int guests = object.nextInt();
		
		boolean largeParty;
		if (guests >= 50)
		{
			largeParty = true;
		}
		else
		{
			largeParty = false;
		}
		
		System.out.println("\nLarge party: " + largeParty + "\n");
		
		System.out.printf("%s%.2f%n", "Price per guest: $", price);
		
		double total = price * guests;
		System.out.printf("%s%d%s%.2f", "Total for ", guests, " guests: $", total);
	}
}
