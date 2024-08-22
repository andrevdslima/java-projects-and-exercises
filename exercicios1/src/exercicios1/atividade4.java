package exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		int num, horas;
		double valor, salario;
		
		System.out.print("Enter the employee number, number of hours worked and the amount you receive per hour: ");
		
		num = sc.nextInt();
		horas = sc.nextInt();
		
		valor = sc.nextDouble();
		
		salario = valor * horas;
		
		System.out.println("Number = " + num);
		System.out.printf("Salary = U$ %.2f%n", salario);
		
		sc.close();
		

	}

}
