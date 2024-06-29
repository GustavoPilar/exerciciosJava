package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many dollar will be bought? ");
		double dollar = sc.nextDouble();
		System.out.printf("Amount to be paid in reais: R$%.2f%n", CurrencyConverter.converter(dollar));
		
		sc.close();
	}

}
