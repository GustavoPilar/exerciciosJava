import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as seguintes cordenadas:");
		System.out.print("X: ");
		double x = sc.nextDouble();
		System.out.print("Y: ");
		double y = sc.nextDouble();
		
			while (x != 0 && y != 0) {
				if(x > 0) {
					if (y > 0) {
						System.out.println("Primeiro quadrante");
					} else {
						System.out.println("Quarto quadrante");
					}
				} else {
					if(y > 0) {
						System.out.println("Segundo quadrante");
					} else {
						System.out.println("Terceiro quadrante");
					}
				}
				
				System.out.println("Digite novamente as cordenadas: ");
				System.out.print("X: ");
				x = sc.nextDouble();
				System.out.print("Y: ");
				y = sc.nextDouble();
			}
		
		sc.close();

	}

}
