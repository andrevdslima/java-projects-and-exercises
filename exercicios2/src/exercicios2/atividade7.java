package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class atividade7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.print("Informe 2 valores com uma casa decimal (x e y): ");
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if(x > 0 && y > 0){
			System.out.println("Q1");
		}
		else{
			if(x > 0 && y < 0) {
				System.out.println("Q4");
			}
			else{
				if(x < 0 && y > 0){
					System.out.println("Q2");
				}
				else{
					if(x < 0 && y < 0){
						System.out.println("Q3");
					}
					else{
						if(x == 0 && y != 0){
							System.out.println("Eixo Y");
						}
						else{
							if(x != 0 && y == 0){
								System.out.println("Eixo X");
							}
							else {
								System.out.println("Origem");
							}
						}
					}
					
				}
			}
		}
		
		sc.close();
		
	}

}
