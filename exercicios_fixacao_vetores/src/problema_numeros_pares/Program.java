package problema_numeros_pares;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("\nNUMEROS PARES: ");
		
		int counter = 0;
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(vect[i] + "  ");
				counter++;
			}
		}
			
		System.out.println();
		
		System.out.print("\nQUANTIDADE DE PARES = " + counter);
		
		sc.close();

	}

}
