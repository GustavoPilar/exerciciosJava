import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int numero = sc.nextInt();
		
		if(numero >= 0) {
			System.out.println("Número posítivo.");
		} else {
			System.out.println("Número negativo");
		}
		
		
		sc.close();
	}

}
