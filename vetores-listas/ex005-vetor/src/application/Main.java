package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números vai digitar: ");
		int n = sc.nextInt();
		double[] numeros = new double[n];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextDouble();
		}
		
		System.out.printf("Maior valor: %.1f%n", maiorValor(numeros));
		System.out.printf("Posicao maior: %d", posicaoMaior(numeros));
		
		sc.close();

	}
	
	public static double maiorValor(double[] numeros) {
		double numeroMaior = 0;
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > numeroMaior) {
				numeroMaior = numeros[i];
			}
		}
		
		return numeroMaior;
	}
	
	public static int posicaoMaior(double[] numeros) {
		int posicao = 0;
		for(int i = 0; i < numeros.length; i++) {
			if(maiorValor(numeros) == numeros[i]) {
				posicao = i;
			}
		}
		
		return posicao;
	}

}
