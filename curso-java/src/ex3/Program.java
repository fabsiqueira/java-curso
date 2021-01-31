package ex3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student[] vect = new Student[10];
		System.out.print("How many rooms will be rented? ");
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			vect[room] = new Student(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ":" + vect[i]);
			}
		}

		sc.close();

	}

}
