package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Aluno: ");
		String nome = sc.nextLine();
		System.out.print("Notas 1, 2 e 3 respectivamente: ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		Aluno aluno = new Aluno(nome ,n1, n2, n3);
		
		System.out.println(aluno);
		
		sc.close();

	}

}
