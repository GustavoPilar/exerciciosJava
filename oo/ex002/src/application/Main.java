package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Worker;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Gross salary: ");
		double salary = sc.nextDouble();
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		
		Worker wk = new Worker(name, salary, tax);
		
		System.out.println("Employee: " + wk);
		
		System.out.print("Which percentage to increase salary? ");
		float percentage = sc.nextFloat();
		wk.increaseSalary(percentage);
		
		System.out.println("Updated data: " + wk);
		
		
		sc.close();

	}

}
