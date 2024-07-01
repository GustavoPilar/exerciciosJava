package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de linhas e colunas, respectivamente: ");
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		int[][] matriz = new int[linha][coluna];
		
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Número: ");
		int numero = sc.nextInt();
		
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				if(matriz[i][j] == numero) {
					System.out.println("Position " + i + ", " + j + ": ");
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
		}
		
		
		sc.close();

	}
}
