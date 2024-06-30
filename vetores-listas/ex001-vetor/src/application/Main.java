package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você deseja digitar (1 - 10)? ");
		int numero = sc.nextInt();
		int[] numeros = new int[numero];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o número: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Numeros negativos: " );
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] < 0) {
				System.out.print("[" + numeros[i] + "] ");
			}
		}
		
		sc.close();
	}

}
