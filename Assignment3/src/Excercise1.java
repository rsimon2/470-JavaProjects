import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Excercise1 
{
	public static void main(String[] args)
	{
		Scanner number = new Scanner(System.in);
		
		int num = 0;
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int i = 0;
		
		while (num != -99)
		{
			System.out.print("Enter an integer (-99 to stop): ");
			num = number.nextInt();
			
			if (num != -99)
			{
				arrList.add(num);
			}
		}
		
		Collections.sort(arrList);
		
		System.out.println("The smallest number was: " + arrList.get(0));
		System.out.println("The largest number was: " + arrList.get(arrList.size() - 1));
	}
}
