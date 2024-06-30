package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import util.Calculator;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você digitará? ");
		int n = sc.nextInt();
		Pessoa[] pessoas = new Pessoa[n];
		
		for(int i = 0; i < pessoas.length; i++) {
			System.out.print("Altura  e genêro da " + (i +1) + "° pessoa: ");
			float altura = sc.nextFloat();
			char sexo = sc.next().charAt(0);
			pessoas[i] = new Pessoa(altura, sexo);
		}
		
		System.out.println("Menor altura: " + Calculator.menorAltura(pessoas));
		System.out.println("Maior altura: " + Calculator.maiorAltura(pessoas));
		System.out.printf("Média da altura das mulheres: %.2f%n", Calculator.mediaAlturaMulheres(pessoas));
		System.out.println("Numero de homens: " + Calculator.qtdHomens(pessoas));
		
		sc.close();
	}

}
