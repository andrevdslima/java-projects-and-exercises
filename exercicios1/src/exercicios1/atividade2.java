package exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner (System.in);
	
	double raio, area, pi = 3.14159;
	
	System.out.print("Digite o valor do raio de um circulo: ");
	
	raio = sc.nextDouble();
	
	area = pi * Math.pow(raio, 2.0);
	
	System.out.printf("Area: %.4f%n", area);
	
	
	sc.close();
	
	
	}
}
