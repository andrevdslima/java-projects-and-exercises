package exercicios2;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Informe um número inteiro: ");
		
		x = sc.nextInt();
		
		if (x < 0) {
			
			System.out.println("Negativo");
			
		} 
		else {
			
			System.out.println("Não Negativo");
			
		}
			
			sc.close();
		
	}

}
