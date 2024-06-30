package util;

import entities.Pessoa;

public class Calculator {
	public static String maisVelha(Pessoa[] pessoas) {
		byte idade = 0;
		String nome = "";
		
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getIdade() > idade) {
				idade = pessoas[i].getIdade();
				nome = pessoas[i].getNome();
			}
		}
		
		return nome;
	}
}
