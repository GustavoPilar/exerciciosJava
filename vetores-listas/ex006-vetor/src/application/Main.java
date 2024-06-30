package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		lerVetor(vetorA);
		System.out.println("Digite os valores do vetor B: ");
		lerVetor(vetorB);
		
		System.out.println("Vetor C");
		for(int i = 0; i < n; i++) {
			System.out.println(somaVetores(vetorA, vetorB)[i]);
		}
		
		sc.close();
	}

	public static void lerVetor(int[] vetor) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
		}
	}
	
	public static int[] somaVetores(int[] vetorA, int[] vetorB) {
		int[] vetorC = new int[vetorA.length];
		for(int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		return vetorC;
	}
}
