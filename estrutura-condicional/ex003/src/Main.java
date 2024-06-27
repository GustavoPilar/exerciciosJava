import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A e B, respectivamente: ");
		int a = sc.nextInt(), b = sc.nextInt();
		
		if(a > b) {
			if(a % b == 0) {
				System.out.println("Múltiplos");
			} else {
				System.out.println("Não são múltiplos");
			}
		} else {
			if(b % a == 0) {
				System.out.println("Múltiplos");
			} else {
				System.out.println("Não são múltiplos");
			}
		}
		
		sc.close();

	}

}
