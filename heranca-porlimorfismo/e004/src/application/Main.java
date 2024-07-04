package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> taxPayers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payer: ");
		int number = sc.nextInt();
		
		for(int i = 0; i < number; i++) {
			sc.nextLine();
			System.out.println("\n-- Tax payer #" + (i+1) + " data --");
			System.out.print("Individual or Company (i/c)? ");
			char payer = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: U$");
			double AnualIncome = sc.nextDouble();
			if(payer == 'i') {
				System.out.print("Health Expenditures: U$");
				double health = sc.nextDouble();
				taxPayers.add(new Individual(name, AnualIncome, health));
			} else {
				System.out.print("Number of Employees: ");
				int employees = sc.nextInt();
				taxPayers.add(new Company(name, AnualIncome, employees));
			}
		}
		
		double taxTotal = 0.0;
		System.out.println("\nTAXES PAID:");
		for(TaxPayer t : taxPayers) {
			System.out.println(t);
			taxTotal += t.tax();
		}
		
		System.out.printf("\nTAXES TOTAL: U$%.2f%n", taxTotal);
		
		sc.close();

	}

}
