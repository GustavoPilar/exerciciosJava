import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n != 0) {
			int resultado = 1;
			for(int i = 1; i <= n; i++) {
				resultado = resultado * i;
			}
			System.out.println(resultado);
		} else {
			System.out.println(1);
		}
		
		System.out.println("Fim.");
		
		sc.close();

	}

}
