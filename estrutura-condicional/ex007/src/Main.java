import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois valores com um ponto decimal:");
		System.out.print("Valor x: ");
		float x = sc.nextFloat();
		System.out.print("Valor y: ");
		float y = sc.nextFloat();
		
		if(x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x > 0) {
			if(y > 0) {
				System.out.println("Primeiro quadrante");
			} else {
				System.out.println("Quarto quadrante");
			}
		} else if (x < 0) {
			if(y > 0) {
				System.out.println("Segundo Quadrante");
			} else {
				System.out.println("Terceiro quadrante");
			}
		}
		
		sc.close();

	}

}
