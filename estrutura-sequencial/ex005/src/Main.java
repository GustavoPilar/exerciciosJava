import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código do funcionário: ");
		byte funcionario = sc.nextByte();
		System.out.print("Quantas horas esse funcionário trabalhou? ");
		short horasTrabalhadas = sc.nextShort();
		System.out.print("Quanto por hora ele ganha? R$");
		float ganhoHora = sc.nextFloat();
		
		float salario = horasTrabalhadas * ganhoHora;
		
		System.out.println("Número do funcionário: " + funcionario);
		System.out.printf("Salário: R$%.2f%n", salario);

	}

}
