import java.util.Scanner;

public class Exercise4
{
	public static void main(String[] args)
	{
		Scanner number = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		int operand1 = number.nextInt();
		
		System.out.print("Enter 2nd number: ");
		int operand2 = number.nextInt();
		
		System.out.print("Enter 3rd number: ");
		int operand3 = number.nextInt();
		
		int sum = operand1 + operand2 + operand3;
		System.out.println("\n" + operand1 + " + " + operand2 + " + " + operand3 + " = " + sum);
		
		int average = (operand1 + operand2 + operand3) / 3;
		System.out.println("\nAverage = " + average);
	}
}
