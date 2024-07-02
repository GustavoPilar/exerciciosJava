package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comentario;
import entities.Publicacao;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Tenha uma boa viagem!");
		Comentario c2 = new Comentario("Wow, isso é maravilhoso!");
		Comentario c3 = new Comentario("Boa noite!");
		Comentario c4 = new Comentario("Que a força esteja com você!");
		
		Publicacao pub1 = new Publicacao(LocalDateTime.parse("21/06/2024 13:05:44", fmt), 
				"Vianjando para Nova Zelandida", 
				"Estou indo visitar esse lindo país!",
				12);
		
		pub1.addCometario(c1);
		pub1.addCometario(c2);		
		System.out.println(pub1);
		
		Publicacao pub2 = new Publicacao(LocalDateTime.parse("01/07/2024 21:23:44", fmt), 
				"Boa noite, pessoal", 
				"Vejo vocês amanhã",
				5);

		pub2.addCometario(c3);
		pub2.addCometario(c4);
		System.out.println(pub2);

	}

}
