package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollarBought = sc.nextDouble();
		
		System.out.print("Amount to be paid in reais = " + String.format("%.2f", CurrencyConverter.converter(dollarPrice, dollarBought)));
		
		sc.close();
		
	}

}
