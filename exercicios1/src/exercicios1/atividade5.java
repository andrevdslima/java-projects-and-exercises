package exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		int codpc1, codpc2, numpc1, numpc2;
		double valorpc1, valorpc2, valorpago;
		
		System.out.println("Informe o código de uma peça 1, o número de peças 1 e o valor unitário de cada peça 1. Depois, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2: ");
		
		codpc1 = sc.nextInt();
		numpc1 = sc.nextInt();
		valorpc1 = sc.nextDouble();
		
		codpc2 = sc.nextInt();
		numpc2 = sc.nextInt();
		valorpc2 = sc.nextDouble();
		
		valorpago = numpc1 * valorpc1 + numpc2 * valorpc2;
		
		System.out.printf("Valor a pagar: R$ %.2f%n ", valorpago);
		
		sc.close();

	}

}
