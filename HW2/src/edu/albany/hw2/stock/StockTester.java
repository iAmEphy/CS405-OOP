package edu.albany.hw2.stock;


public class StockTester {

	public static void main(String[] args) {
		
		
		Stock MicrosoftStock = new Stock(Stock.Symbol.MSFT); 
		MicrosoftStock.setClosingPrice(10);
		
		MicrosoftStock.setCurrentPrice(20);
		System.out.println("MSFT Percent change " + MicrosoftStock.getChangePercent() + "%");
		
		
		Stock AppleStock = new Stock(Stock.Symbol.AAPL); 
		AppleStock.setClosingPrice(20);
		AppleStock.setCurrentPrice(40);
		System.out.println("AAPL percent change is " + AppleStock.getChangePercent() + "%");
	}
}
