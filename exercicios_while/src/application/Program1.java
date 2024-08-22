package application;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("        |Plano Cartesiano|");
		System.out.println("  coordenadas invalidas X e Y = 0");
		System.out.print("Informe o valor das coordenadas X e Y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else {
				if (x > 0 && y < 0) {
					System.out.println("Quarto");
				} else {
					if (x < 0 && y < 0) {
						System.out.println("Terceiro");
					} else {
						if (x < 0 && y > 0) {
							System.out.println("Segundo");
						}
					}
				}
			}

			System.out.print("\nInforme o valor das coordenadas X e Y: ");
			x = sc.nextInt();
			y = sc.nextInt();

		}

		sc.close();

	}

}
