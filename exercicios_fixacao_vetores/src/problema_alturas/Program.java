package problema_alturas;

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
			sc.nextLine();
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: " );
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			vect[i] = new People(name, age, height);
		}
		
		double averageHeight = 0.0;
		for(int i = 0; i < vect.length; i++) {
			averageHeight += vect[i].getHeight();
		}
		
		averageHeight /= vect.length;
		
		System.out.printf("%nAltura media: %.2f%n", averageHeight);
		
		double underSixTeen = 0.0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getAge() < 16) {
				underSixTeen += 1.0;
			}
		}
		
		underSixTeen *= 100.0 / vect.length;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%", underSixTeen);
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getAge() < 16) {
				System.out.print("\n" + vect[i].getName());
			}
		}
		
		sc.close();
		
	}

}
