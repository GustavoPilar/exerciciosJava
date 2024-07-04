package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;
import entities.Tercerizado;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> empregados = new ArrayList<>();
		System.out.print("Digite o número de funcionários: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("\nFuncinario #" + (i+1) + ":");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Horas trabalhadas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: R$");
			double valorPorHora = sc.nextDouble();
			System.out.print("Tercerizado? (s/n): ");
			char terc = sc.next().charAt(0);
			if(terc != 's') {
				Empregado emp = new Empregado(nome, horas, valorPorHora);
				empregados.add(emp);
			} else {
				System.out.print("Bonus adicional: R$");
				double bonus = sc.nextDouble();
				Empregado emp = new Tercerizado(nome, horas, valorPorHora, bonus);
				empregados.add(emp);
			}
		}
		
		System.out.println("\nPagamentos: ");
		for(Empregado emp : empregados) {
			System.out.println(emp);
		}
		
		sc.close();
	}

}
