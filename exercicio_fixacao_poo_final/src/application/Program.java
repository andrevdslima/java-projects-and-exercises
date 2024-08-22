package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount bankAccount;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		
		System.out.print("Is there a initial deposit(y/n)? ");
		char answer = sc.next().charAt(0);
		
		if(answer == 'y') {
			System.out.print("Enter a initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bankAccount = new BankAccount(accountNumber, accountHolder, initialDeposit);
		} else {
			bankAccount = new BankAccount(accountNumber, accountHolder);
		}
		
		System.out.println();
		
		System.out.println("Account data: \n" + bankAccount);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		
		bankAccount.deposit(deposit);
		
		System.out.println("Updated account data: \n" + bankAccount);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withDraw = sc.nextDouble();
		
		bankAccount.withDraw(withDraw);
		
		System.out.println("Updated account data: \n" + bankAccount);
		
		sc.close();
		
	}

}

