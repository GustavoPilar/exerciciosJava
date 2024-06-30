package application;

import java.util.Scanner;

import entities.Pessoa;
import util.Calculator;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você digitará? ");
		int n = sc.nextInt();
		sc.nextLine();
		Pessoa[] pessoas = new Pessoa[n];
		
		for(int i = 0; i < pessoas.length; i++) {
			System.out.println("Dados da " + (i + 1) + " pessoa: ");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			byte idade = sc.nextByte();
			sc.nextLine();
			
			pessoas[i] = new Pessoa(nome, idade);
		}
		
		System.out.println("A pessoa mais velha é: " + Calculator.maisVelha(pessoas));
		
		sc.close();
	}

}
