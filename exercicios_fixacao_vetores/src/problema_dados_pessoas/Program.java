package problema_dados_pessoas;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		People[] vect = new People[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			double height = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			char gender = sc.next().charAt(0);
			vect[i] = new People(height, gender);
		}
		
		double shorterHeight = vect[0].getHeight();
		double greaterHeight = vect[0].getHeight();
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getHeight() < shorterHeight) {
				shorterHeight = vect[i].getHeight();
			}
		}
		
		System.out.printf("Menor altura = %.2f%n", shorterHeight);
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getHeight() > greaterHeight) {
				greaterHeight = vect[i].getHeight();
			}
		}
		
		System.out.printf("Maior altura = %.2f%n", greaterHeight);
		
		double average = 0.0;
		int counter = 0;
		int numberOfMens = 0;
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getGender() == 'F') {
				average += vect[i].getHeight();
				counter++;
			} else {
				numberOfMens++;
			}
		}
		
		average /= counter;
		
		System.out.printf("Media das alturas das mulheres = %.2f%n", average);
		
		System.out.print("Numero de homens = " + numberOfMens);
		
		sc.close();
		
	}
}
