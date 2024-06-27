import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(
				"Códigos dos produtos e seus valores por únidade:\n"
				+ "[1] - Cachorro quente - R$4,00\n"
				+ "[2] - X-Salada - R$4,50\n"
				+ "[3] - X-Bacon - R$5,00\n"
				+ "[4] - Torrada Simples - R$2,00\n"
				+ "[5] - Refrigerante - R$1,50\n");
		
		System.out.println("Digite o código e a quantidade que deseja: ");
		byte code = sc.nextByte();
		int quantidade = sc.nextInt();
		double valorFinal;
		
		switch (code) {
		case 1: {
			valorFinal = quantidade * 4.00;
			System.out.printf("Total: R$%.2f", valorFinal);
			break;
		}
		case 2: {
			valorFinal = quantidade * 4.50;
			System.out.printf("Total: R$%.2f", valorFinal);
			break;
		}
		case 3: {
			valorFinal = quantidade * 5.00;
			System.out.printf("Total: R$%.2f", valorFinal);
			break;
		}case 4: {
			valorFinal = quantidade * 2.00;
			System.out.printf("Total: R$%.2f", valorFinal);
			break;
		}case 5: {
			valorFinal = quantidade * 1.50;
			System.out.printf("Total: R$%.2f", valorFinal);
			break;
		}
		default:
			System.out.println("Código inválido...");
		}
		
		sc.close();

	}

}
