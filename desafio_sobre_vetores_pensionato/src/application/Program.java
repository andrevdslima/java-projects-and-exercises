package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i+1) + ": ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			System.out.println();
			vect[room] = new Rent(name, email);
		}
		
		System.out.println("Busy rooms: ");
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.print(i + ": " + vect[i].getName() + ", " + vect[i].getEmail() + "\n");
			}
		}
		
		sc.close();
		
	}

}
