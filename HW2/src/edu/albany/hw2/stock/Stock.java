package edu.albany.hw2.stock;

public class Stock {
	
	//Variable
	Symbol symbol;

	private double closingPrice;

	private double currentPrice;
	
	//Enum
	public enum Symbol {
		MSFT("Microsoft"),

		AAPL("Apple"),

		GOOG("Google"),

		AMZN("Amazon");
		
		private String name;
		
		//Constructor
		private Symbol(String name){

			this.name = name;

		}

		public String getName() {

			return this.name;

		}
	}
	
	//Constructor
	public Stock(Symbol aSymbol) {

		this.symbol = aSymbol;

	}
	
	//getter setter
	public Symbol getSymbol() {

		return symbol;

	}

	
	public double getClosingPrice() {

		return closingPrice;

	}

	
	public double getCurrentPrice() {

		return currentPrice;

	}

	
	public void setClosingPrice(double closingPrice) {

		this.closingPrice = closingPrice;

	}

	
	public void setCurrentPrice(double currentPrice) {

		this.currentPrice = currentPrice;
	}



	
	double getChangePercent() {

		return ((this.getCurrentPrice() - this.getClosingPrice()) / this.getClosingPrice()) * 100;

	}
}
