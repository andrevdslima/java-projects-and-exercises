package exercicios1;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.print("Digite 4 valores inteiros: ");
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		diferenca = A * B - C * D;
		
		System.out.println("Diferença do produto de A e B pelo produto de C e D: " + diferenca);
		
		sc.close();
	}
}
