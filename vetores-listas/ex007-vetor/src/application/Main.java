package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] numeros = new double[n];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextDouble();
		}
		
		System.out.printf("Média dos valores: %.3f%n", media(numeros));
		System.out.println("Valores abaixo da média: ");
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] < media(numeros)) {
				System.out.print("[" + numeros[i] + "] ");
			}
		}
		
		sc.close();

	}
	
	public static double media(double[] numeros) {
		double soma = 0;
		for(int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		return soma / numeros.length;
	}

}
