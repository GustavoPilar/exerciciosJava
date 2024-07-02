package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoHora;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.CargoNivel;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o departamento do funcionário: ");
		Departamento departamento = new Departamento(sc.nextLine());
		System.out.println("--Dados do funcionario--");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Nível do cargo: ");
		String cargo = sc.nextLine();
		System.out.print("Sálario base: R$");
		Double salarioBase = sc.nextDouble();
		sc.nextLine();
		
		Trabalhador t = new Trabalhador(nome,  CargoNivel.valueOf(cargo.toUpperCase()), salarioBase, departamento);
		
		System.out.print("Quantos contratos " + t.getNome() + " tem? ");
		int n = sc.nextInt();
		sc.nextLine();
		if(n > 0) {
			for(int i = 0; i < n; i++) {
				System.out.println("Digite os dados do contrato #" + (i+1) + ":");
				System.out.print("Data: (DD/MM/YYYY): " );
				String dataString = sc.nextLine();
				LocalDate data = LocalDate.parse(dataString, fmt);
				System.out.print("Valor por hora: R$");
				Double valorPorHora = sc.nextDouble();
				System.out.print("Duração (horas): ");
				Integer horas = sc.nextInt();
				sc.nextLine();			
				
				t.addContrato(new ContratoHora(data, valorPorHora, horas));
			}
			
			System.out.print("Digite o ano e o mês para calcular a renda (MM/YYYY): ");
			String mesAno = sc.next();
			sc.nextLine();
			
			System.out.println("Nome: " + t.getNome()
								+ "\nDepartamento: " + t.getDepartamento().getNome()
								+ "\nRenda de " + mesAno
								+ ": R$" + String.format("%.2f", t.renda(Integer.valueOf(mesAno.substring(0, 2)), Integer.valueOf(mesAno.substring(3)))));
		} else {
			System.out.println("Nome: " + t.getNome()
								+ "\nDepartamento: " + t.getDepartamento().getNome()
								+ "\nRenda: R$" + String.format("%.2f", t.getSalarioBase()));
		}
		
		sc.close();

	}

}
