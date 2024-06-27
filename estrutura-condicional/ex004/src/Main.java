import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira e a segunda hora, respectivamente: ");
		int horaComeco = sc.nextByte(), horaTermino = sc.nextByte();
		int dia = 24, duracao;
		
		if(horaComeco == 0) {
			horaComeco = dia;
		}
		
		if(horaComeco > horaTermino) {
			duracao = (dia - horaComeco) + horaTermino;
			System.out.println("O jogo durou " + duracao + " Hora(s)");
		} else if (horaComeco < horaTermino) {
			duracao = (dia - horaTermino) + horaComeco;
			System.out.println("O jogo durou " + duracao + " Hora(s)");
		} else {
			duracao = dia;
			System.out.println("O jogo durou " + duracao + " Hora(s)");
		}
		
		
		sc.close();

	}

}
