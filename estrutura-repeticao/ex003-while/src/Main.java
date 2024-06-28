import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte code = sc.nextByte();
		short alcool = 0, gasolina = 0, diesel = 0;
		
		while(code != 4) {
			switch (code) {
			case 1:
				alcool++;
				code = sc.nextByte();
				break;
			case 2:
				gasolina++;
				code = sc.nextByte();
				break;
			case 3:
				diesel++;
				code = sc.nextByte();
				break;
			default:
				code = sc.nextByte();
			}
		}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool + "\n"
							+ "Gasolina: " + gasolina + "\n"
							+ "Diesel: " + diesel + "\n");
		
		sc.close();

	}

}
