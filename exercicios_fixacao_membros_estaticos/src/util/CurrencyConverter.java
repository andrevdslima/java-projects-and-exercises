package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double converter(double dollarPrice, double dollarBought) {
		double x;
		x = dollarPrice * dollarBought * IOF;
		x += dollarPrice * dollarBought;
		return x;
	}
	
}
