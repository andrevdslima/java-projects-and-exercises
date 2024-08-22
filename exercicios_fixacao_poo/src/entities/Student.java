package entities;

import java.util.Scanner;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	Scanner sc = new Scanner(System.in);

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	public void pesoNota() {
		while (grade1 > 30.00){
			System.out.print("O peso da nota do primeiro trimestre e de 30.00, informe novamente a nota: ");
			grade1 = sc.nextDouble();
		}
		while(grade2 > 35.00) {
			System.out.print("O peso da nota do segundo trimestre e de 35.00, informe novamente a nota: ");
			grade2 = sc.nextDouble();
		}
		while(grade3 > 35.00) {
			System.out.print("O peso da nota do terceiro trimestre e de 35.00, informe novamente a nota: ");
			grade3 = sc.nextDouble();
		}
	}

	public void passOrFailed() {
		if (finalGrade() >= 60.00) {
			System.out.println("FINAL GRADE = " + String.format("%.2f", finalGrade()) + "\nPASS");
		} else {
			System.out.println("FINAL GRADE = " + String.format("%.2f", finalGrade()) + "\nFAILED" + "\nMISSING "
					+ String.format("%.2f", 60.00 - finalGrade()) + " POINTS");
		}
	}

}
