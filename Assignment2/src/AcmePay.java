import java.util.Scanner;

public class AcmePay 
{
	public static void main(String[] args)
	{
		Scanner object = new Scanner(System.in);
		
		System.out.print("Please enter the amount of hours worked: ");
		int hours = object.nextInt();
		
		System.out.print("Please enter shift (1 = first, 2 = second, 3 = third): ");
		int shift = object.nextInt();
		
		int retirement = 2;
		
		double hourly = 0;
		switch (shift)
		{
			case 1: 
				hourly = 17.00;
				break;
			case 2:
			{
				hourly = 18.50;
				System.out.print("Participate in retirement plan? (1 = yes, 2 = no): ");
				retirement = object.nextInt();
				break;
			}
			case 3:
			{
				hourly = 22.00;
				System.out.print("Participate in retirement plan? (1 = yes, 2 = no): ");
				retirement = object.nextInt();
				break;
			}
			default:
				System.out.print("Invalid entry. Please enter 1, 2, or 3: ");
				shift = object.nextInt();
		}
		
		int overtime = 0;
		double otPay = 0;
		if (hours > 40)
		{
			overtime = hours - 40;
			otPay = ((hourly * 1.5) * overtime);
		}
		double total = (hours - overtime) * hourly;
		double totalWithOT = total + otPay; 
		
		double deduct = 0.00;
	
		if (retirement == 1)
		{
			deduct = 0.03;
		}
		else if (retirement == 2)
		{
			deduct = 0.00;
		}
		
		double retireDeduct = totalWithOT * deduct;

		double netPay = totalWithOT - retireDeduct;
		
		System.out.println("Hours worked: " + hours);
		System.out.println("Shift: " + shift);
		System.out.printf("Hourly pay rate: %.2f%n", hourly);
		System.out.printf("Regular pay: %.2f%n", total);
		System.out.printf("Overtime pay: %.2f%n", otPay);
		System.out.printf("Total with overtime: %.2f%n", totalWithOT);
		System.out.printf("Retirement Plan deduction: %.2f%n", retireDeduct);
		System.out.printf("Net Pay: %.2f%n", netPay);
	}
}