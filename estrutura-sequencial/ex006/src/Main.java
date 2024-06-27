import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		short code1, code2;
		byte qtdPeca1, qtdPeca2;
		float preco1, preco2;
		
		System.out.println("Digite o código, a quantidade e o valor da peça 1: ");
		code1 = sc.nextShort();
		qtdPeca1 = sc.nextByte();
		preco1 = sc.nextFloat();
		
		System.out.println("Digite o código, a quantidade e o valor da peça 2: ");
		code2 = sc.nextShort();
		qtdPeca2 = sc.nextByte();
		preco2 = sc.nextFloat();
		
		double valor = (qtdPeca1 * preco1) + (qtdPeca2 * preco2);
		
		System.out.printf("Valor à pagar: R$%.2f%n", valor);
		
		sc.close();

	}

}
