public class Purchase 
{
	private int invoice;
	private double sale;
	public static double tax;
	
	public int getInvoiceNumber()
	{
		return invoice;
	}
	
	public void setInvoiceNumber(int newInvoice)
	{
		this.invoice = newInvoice;
		
		newInvoice++;
	}
	
	public double getSaleAmount()
	{
		return sale;
	}
	
	public void setSaleAmount(double newSale)
	{
		this.sale = newSale;
		
		tax = newSale * .05;
	}
}
