package exercicios2;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x;
		
		System.out.print("Informe um número inteiro: ");
		
		x = sc.nextInt();
				
		if (x % 2 == 0) {
			
			System.out.println("Par");
			
		}
		else {
			
			System.out.println("Ímpar");
			
		}
		
			sc.close();
		
	}

}
