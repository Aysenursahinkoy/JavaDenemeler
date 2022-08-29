package Bolum9Alistirma;

public class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	Stock(String symbol, String name){
		this.symbol=symbol;
		this.name=name;
		
	}
	Stock(String symbol,String name,double previousClosingPrice){
		this.symbol=symbol;
		this.name=name;
		this.previousClosingPrice=previousClosingPrice;
	}
	double getChangePercent () {
		return (currentPrice-previousClosingPrice)/previousClosingPrice;
	}
	
}
