package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import util.Calculator;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitas: ");
		int numero = sc.nextInt();
		sc.nextLine();
		Pessoa[] pessoas = new Pessoa[numero];
		
		for(int i = 0; i < pessoas.length; i++) {
			System.out.println("Dados da " + (i + 1) + ":");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			float altura = sc.nextFloat();
			sc.nextLine();
			
			pessoas[i] = new Pessoa(nome, idade, altura);
		}
		
		System.out.printf("Altura média: %.2f%n", Calculator.alturaMedia(pessoas));
		System.out.printf("Pessoas com menos de 16: %.1f%% %n", Calculator.menores16(pessoas));
		
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getIdade() < 16) {
				System.out.println(pessoas[i].getNome());
			}
		}
		
		sc.close();
		
	}

}
