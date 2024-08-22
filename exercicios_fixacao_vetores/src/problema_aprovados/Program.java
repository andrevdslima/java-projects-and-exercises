package problema_aprovados;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		Student[] vect = new Student[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno: ");
			sc.nextLine();
			String name = sc.nextLine();
			double grade = sc.nextDouble();
			double grade1 = sc.nextDouble();
			vect[i] = new Student(name, grade, grade1);
		}
		
		System.out.println("Alunos aprovados: ");
		
		for(int i = 0; i < vect.length; i++) {
			double average = ((vect[i].getGrade() + vect[i].getGrade1()) / 2.0);
			if(average >= 6.0) {
				System.out.println(vect[i].getName());
			}
		}

		sc.close();
		
	}

}
