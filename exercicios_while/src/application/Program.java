package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma senha: ");
		int x = sc.nextInt();

		while (x != 2002) {
			System.out.println("Senha inválida!");
			System.out.print("Digite uma senha: ");
			x = sc.nextInt();
		}

		System.out.println("Acesso permitido!");

		sc.close();

	}

}
