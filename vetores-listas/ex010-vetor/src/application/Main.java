package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos? ");
		int n = sc.nextInt();
		sc.nextLine();
		Aluno[] alunos = new Aluno[n];
		
		for(int i = 0; i < alunos.length; i++) {
			System.out.println((i + 1) + "° aluno:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("1° nota: ");
			double nota1 = sc.nextDouble();
			System.out.print("2° nota: ");
			double nota2 = sc.nextDouble();
			sc.nextLine();
			
			alunos[i] = new Aluno(nome, nota1, nota2);
		}
		
		System.out.println("Alunos aprovados: ");
		for(int i = 0; i < alunos.length; i++) {
			if(alunos[i].media()) {
				System.out.println(alunos[i].getNome());
			}
		}
		
		sc.close();

	}

}
