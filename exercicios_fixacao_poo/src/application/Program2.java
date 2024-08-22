package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		
		System.out.print("Informe o nome do aluno e suas 3 notas (1º nota com peso 30.00, 2º e 3º nota com peso 35.00): ");
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		student.pesoNota();
		
		student.passOrFailed();
		
		sc.close();
		
	}

}
