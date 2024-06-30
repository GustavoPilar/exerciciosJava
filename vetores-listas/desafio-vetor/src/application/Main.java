package application;

import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aluno[] alunos = new Aluno[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Aluguel" + " #" + (i + 1) + ":");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int room = sc.nextInt();
			
			while(!(quartoVazio(alunos, room))) {
				System.out.print("Quarto ocupado. Esolha outro: ");
				room = sc.nextInt();
			}
			
			sc.nextLine();
			
			alunos[room] = new Aluno(name, email, room);
		}
		
		System.out.println("Quartos ocupados: ");
		for(int i = 0; i < alunos.length; i++) {
			if(alunos[i] != null) {
				System.out.println(alunos[i]);
			}
		}
		
		sc.close();

	}
	
	public static boolean quartoVazio(Aluno[] alunos, int indice) {
		if(alunos[indice] != null) {
			return false;
		} else {
			return true;
		}
	}

}
