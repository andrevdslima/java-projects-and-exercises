package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class atividade8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto = 0;
		
		System.out.print("Informe um valor com duas casas decimais: ");
		
		salario = sc.nextDouble();
		
		
		if(salario <= 2000.00) {
			System.out.println("Isento.");
		}
		else {
			if(salario <= 3000.00) {
				imposto = 8.00/100.00 * (salario % 2000.00);
				System.out.printf("R$ %.2f%n", imposto);
			}
			else {
				if(salario <= 4500.00) {
					imposto = salario %  2000.00;
					imposto = imposto % 1000.00;
					imposto = (18.00/100.00 * imposto) + (8.00/100.00 * 1000.00);
					System.out.printf("Imposto de renda: R$ %.2f%n", imposto);
				}
				else {
					imposto = salario % 2000.00;
					imposto = salario % 1000.00;
					imposto = salario % 1500.00;
					imposto = (28.00/100.00 * imposto) + (18.00/100.00 * 1500.00) + (8.00/100.00 * 1000.00);
					System.out.printf("Imposto de renda: R$ %.2f%n", imposto);
				}
			}
		}
	
		
		
		
		sc.close();
		
	}

}
