import java.util.Scanner;

public class NineInts 
{
	public static void main(String[] args)
	{
		Scanner number = new Scanner(System.in); 
		int[] arr;
		
		arr = new int[9];
		
		for (int i = 0; i < 9; i++)
		{
			System.out.print("Enter a number: ");
			arr[i] = number.nextInt();
		}
		
		for (int j = 0; j < 9; j++)
		{
			System.out.print(arr[j] + " ");
		}
		
		System.out.println("\n");
		
		for (int k = 8; k >=0; k--)
		{
			System.out.print(arr[k] + " ");
		}
	}
}
