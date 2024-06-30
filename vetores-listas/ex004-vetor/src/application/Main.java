package application;

import java.util.Scanner;

import util.funcaoNumeral;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int numero = sc.nextInt();
		int[] numeros = new int[numero];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Numeros pares:");
		for(int i = 0; i < numeros.length; i++) {
			if(funcaoNumeral.numeroPar(numeros[i])) {
				System.out.print(numeros[i] + " ");
			}
		}
		
		System.out.println("\nQuantidade de pares: " + funcaoNumeral.qtdPares(numeros));
		
		sc.close();
	}
}
