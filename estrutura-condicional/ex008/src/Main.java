import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu salário bruto mensal: R$");
		double salario = sc.nextDouble();
		
		// Tabela Imposto de Renda mensal 2024
		if(salario < 2259.20) {
			System.out.println("Isento");
		} else if (salario <= 2826.65) {
			double ir = (salario / 10) * 0.75;
			System.out.printf("Dedução: R$%.2f%n", ir);
		}else if (salario <= 3751.05) {
			double ir = (salario / 10) * 1.5;
			System.out.printf("Dedução: R$%.2f%n", ir);
		}else if (salario <= 4664.68){
			double ir = (salario / 10) * 2.25;
			System.out.printf("Dedução: R$%.2f%n", ir);
		} else {
			double ir = (salario / 10) * 2.75;
			System.out.printf("Dedução: R$%.2f%n", ir);
		}
		
		sc.close();

	}

}
