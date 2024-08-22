package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class atividade6 {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		System.out.println("        |Intervalos|");
		System.out.println("[0,25] [25,50] [50,75] [75,100]");
		System.out.print("Informe um valor qualquer: ");
		
		x = sc.nextDouble();
		
		if(x < 0 || x > 100){
			System.out.println("Fora de intervalo.");
		}
		else {
			if(x <= 25){
				System.out.println("Intervalo(0, 25).");
			}
			else {
				if(x <= 50){
					System.out.println("Intervalo(25,50).");
				}
				else{
					if(x <= 75){
						System.out.println("Intervalo(50,75).");
					}
					else {
							System.out.println("Intervalo(75,100).");
					}
				}
			}
		}
		
			sc.close();
		
		
		

	}

}
