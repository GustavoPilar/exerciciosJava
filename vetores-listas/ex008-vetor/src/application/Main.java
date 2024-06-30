package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] numeros = new int[n];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextInt();
			
		}
		
		showResult(numeros);
		
		sc.close();
		
	}
	
	public static double mediaPares(int[] numeros) {
		double soma = 0;
		int pares = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				soma += numeros[i];
				pares++;
			}
		}
		
		if(soma != 0) {
			return soma / pares;
		} else {
			return 0;
		}
	}
	
	public static void showResult(int[] numeros) {
		if(mediaPares(numeros) != 0) {
			System.out.printf("MEDIA DOS PARES: %.1f%n", mediaPares(numeros));
		} else {
			System.out.println("NENHUM PAR ENCONTRADO.");
		}
	}
	
}
