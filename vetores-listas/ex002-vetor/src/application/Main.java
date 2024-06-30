package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números irá digitar? ");
		int numero = sc.nextInt();
		double[] numeros = new double[numero];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextDouble();
		}
		
		System.out.println("Valores: " + Arrays.toString(numeros));
		System.out.println("Soma: " + soma(numeros));
		System.out.println("Media: " + media(numeros));
		
		
		sc.close();

	}
	
	public static double soma(double[] numeros) {
		double soma = 0;
		for(int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		
		return soma;
	}
	
	public static double media(double[] numeros) {
		double soma = soma(numeros);
		for(int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		
		return soma / numeros.length;
	}
	
	

}
