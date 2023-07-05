public class Candle 
{
	private String color;
	protected int height;
	protected double price;
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String newColor)
	{
		this.color = newColor;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setHeight(int newHeight)
	{
		this.height = newHeight;
		
		price = 2 * newHeight;
	}
	
	public double getPrice()
	{
		return price;
	}
}
