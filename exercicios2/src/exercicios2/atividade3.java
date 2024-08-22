package exercicios2;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A, B;
		
		System.out.print("Informe 2 valores inteiros: ");
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			
			System.out.println("São múltiplos");
			
		}
		else {
			
			System.out.println("Não são múltiplos");
			
		}
		
		
			sc.close();

	}

}
