import java.util.Scanner;

public class DemoCandles 
{
	public static void main(String[] args)
	{
		Scanner object = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		
		String color;
		int height = 0;
		String scent;
		
		System.out.println("Welcome to Demo Candles\n");
		
		System.out.print("Please type in the color of the candle you'd like: ");
		color = object.nextLine();
		
		System.out.print("Please type in the height (in inches) you'd like your candle to be ($2.00 per inch): ");
		height = number.nextInt();
		number.nextLine();
		
		System.out.print("Please type what scent you'd like ($1.00 per inch upcharge). Type \"no\" for no scent: ");
		scent = object.nextLine();
		
		if (scent.equals("no") || scent.equals("No") || scent.equals("NO") || scent.equals("nO"))
		{
			Candle candle = new Candle();
			candle.setColor(color);
			candle.setHeight(height);
			
			System.out.printf("The %d inch %s candle costs $%.2f.", candle.getHeight(), candle.getColor(), candle.price);
		}
		else
		{
			ScentedCandle scentedCandle = new ScentedCandle();
			scentedCandle.setColor(color);
			scentedCandle.setHeight(height);
			scentedCandle.setScent(scent);
			
			System.out.printf("The %d inch %s %s candle costs $%.2f.", scentedCandle.getHeight(), scentedCandle.getScent(), scentedCandle.getColor(), scentedCandle.price);
		}
	}
}