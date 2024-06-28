import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int quadrado = (int) Math.pow(i, 2);
			int cubo = (int) Math.pow(i, 3);
			System.out.println(i + " " + quadrado + " " + cubo);
		}
		
		sc.close();
		
	}

}
