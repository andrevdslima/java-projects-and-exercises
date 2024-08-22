package application;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("| 1.Alcool | 2.Gasolina | 3.Diesel | 4.Fim |");
		System.out.println("Informe o tipo de combustivel abastecido: ");

		int x = sc.nextInt(), a = 0, g = 0, d = 0;

		while (x != 4) {
			while (x < 1 || x > 4) {
				System.out.println("Codigo invalido!");
				System.out.print("Informe o tipo de combustivel abastecido: ");
				x = sc.nextInt();
			}
			if (x == 1) {
				a += 1;
			} else {
				if (x == 2) {
					g += 1;
				} else {
					if (x == 3) {
						d += 1;
					}
				}
			}

			x = sc.nextInt();

		}

		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + a);
		System.out.println("Gasolina: " + g);
		System.out.println("Diesel: " + d);

		sc.close();

	}

}
