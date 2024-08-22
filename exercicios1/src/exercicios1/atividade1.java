package exercicios1;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite dois numeros inteiros para somar: ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = (x + y);
		
		System.out.println("Soma: " + soma);
	
				
			
		sc.close();
	}

}
