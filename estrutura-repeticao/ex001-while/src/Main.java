import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite sua senha: ");
		int senha = sc.nextInt();
		
		while(senha != 2004) {
			System.out.print("Acesso negado! Senha incorreta.\nDigite novamente: ");
			senha = sc.nextInt();
		}

		System.out.println("Acesso permitido. Bem vindo!");
		sc.close();
	}

}
