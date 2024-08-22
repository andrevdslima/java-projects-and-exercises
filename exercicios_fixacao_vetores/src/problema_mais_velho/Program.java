package problema_mais_velho;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		People[] vect = new People[n];
		
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			vect[i] = new People(name, age);
		}
		
		String olderPerson = vect[0].getName();
		int age = vect[0].getAge();
		
		for(int i = 0; i < vect.length; i++) {
			if(age < vect[i].getAge()) {
				age = vect[i].getAge();
				olderPerson = vect[i].getName();
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + olderPerson);
		
		sc.close();
	}

}
