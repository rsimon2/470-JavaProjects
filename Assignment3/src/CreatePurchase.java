import java.util.Scanner;

public class CreatePurchase 
{
	public static void main(String[] args)
	{
		Scanner number = new Scanner(System.in);
		
		int invoiceNum = 999;
		double saleAmt = -1.00;
		
		while (!(invoiceNum >= 1000 && invoiceNum <= 8000))
		{
			System.out.print("Please create an invoice number between 1000 and 8000: ");
			invoiceNum = number.nextInt();
		}
		
		while (saleAmt < 0.01)
		{
			System.out.print("Please enter a sale amount (cannot be negative): $");
			saleAmt = number.nextDouble();
		}
		
		Purchase invoice = new Purchase();
		invoice.setInvoiceNumber(invoiceNum);
		invoice.setSaleAmount(saleAmt);
		
		System.out.println("Invoice number: " + invoice.getInvoiceNumber());
		System.out.printf("Subtotal: $%.2f%n", invoice.getSaleAmount());
		System.out.printf("Sales tax: $%.2f%n", Purchase.tax);
		System.out.printf("Total: $%.2f%n", (invoice.getSaleAmount() + Purchase.tax));		
	}
}
