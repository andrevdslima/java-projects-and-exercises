package exercicios2;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hi, hf, dr;
		
		System.out.print("Informe a hora inicial e a hora final de um jogo: ");
		
		hi = sc.nextInt();
		hf = sc.nextInt();
		
		if(hi < hf) {
			
			dr = hf - hi;
			
		}
		else {
			
			dr = 24 - hi + hf;
					
			}
		
		System.out.println("O Jogo Durou " + dr + " Hora(s)");
		
			sc.close();
	
	}

}
