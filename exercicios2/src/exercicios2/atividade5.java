package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		System.out.println("|  Codigo  |  Especificacao  |  Preco  |");
		System.out.println("|    1     | Cachorro Quente | R$ 4.00 |");
		System.out.println("|    2     |    X-Salada     | R$ 4.50 |");
		System.out.println("|    3     |     X-Bacon     | R$ 5.00 |");
		System.out.println("|    4     | Torrada Simples | R$ 2.00 |");
		System.out.println("|    5     |   Refrigerante  | R$ 1.50 |");
		System.out.print("\nInforme o código do item e sua quantidade: ");
		
		double codigo = sc.nextDouble(), quantidade = sc.nextDouble(), total;
		
		if(codigo == 1){
			total = quantidade * 4.00;
		}
		else {
			if(codigo == 2){
				total = quantidade * 4.50;
			}
			else {
				if(codigo == 3) {
					total = quantidade * 5.00;
					}
				else {
					if(codigo == 4){
						total = quantidade * 2.00;
					}
					else {
						total = quantidade * 1.50; 
					}
				}
			}
		
			System.out.printf("\nTotal: R$ %.2f%n", total);
			
			sc.close();

			}
	
	}
}


