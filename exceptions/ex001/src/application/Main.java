package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.exceptions.DomainException;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("-- Digite os dados da conta -- ");
			System.out.print("Número: ");
			int numero = sc.nextInt();
			sc.nextLine();
			System.out.print("Titular: ");
			String titular = sc.nextLine();
			System.out.print("Saldo inicial: R$");
			double saldo = sc.nextDouble();
			System.out.print("Limite de saque: R$");
			double limiteSaque = sc.nextDouble();
			
			Conta conta = new Conta(numero, titular, saldo, limiteSaque);
			System.out.println("\n" + conta);
			
			System.out.print("\nDigite o valor do saque: R$");
			double saque = sc.nextDouble();
			conta.saque(saque);
			System.out.println(conta);
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro inesperado.");
		}
		finally {
			System.out.println("Fim do programa.");
			sc.close();
		}

	}

}
