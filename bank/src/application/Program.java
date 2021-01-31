package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount bank;

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there a initial deposit value(y/n)? ");
		char dep = sc.next().charAt(0);

		if (dep == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bank = new BankAccount(accountNumber, name, initialDeposit);
			
		} else {
			bank = new BankAccount(accountNumber, name);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		bank.addValue(deposit);
		System.out.println("Updated data: ");
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		bank.removeValue(withdraw);
		System.out.println("Updated data: ");
		System.out.println(bank);

		sc.close();

	}

}
