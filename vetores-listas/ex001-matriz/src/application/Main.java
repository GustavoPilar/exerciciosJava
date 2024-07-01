package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		int negativos = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("Digite um valor: ");
				int valor = sc.nextInt();
				matriz[i][j] = valor;
				if(valor < 0) {
					negativos++;
				}
			}
		}
		
		System.out.println("Digonal principal: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j == i) {
					System.out.print("[" + matriz[i][j] + "] ");
				} else {
					System.out.print("[" + " ] ");
				}
			}
			System.out.println();
		}
		
		System.out.println("Quantidade de números negativos: " + negativos);
		
		sc.close();

	}

}
