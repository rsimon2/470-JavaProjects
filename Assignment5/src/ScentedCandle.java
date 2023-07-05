
public class ScentedCandle extends Candle
{
	private String scent;
	
	public String getScent()
	{
		return scent;
	}
	
	public void setScent(String newScent)
	{
		this.scent = newScent;
	}
	
	public void setHeight(int newHeight)
	{
		this.height = newHeight;
		
		price = 3 * newHeight;
	}
}