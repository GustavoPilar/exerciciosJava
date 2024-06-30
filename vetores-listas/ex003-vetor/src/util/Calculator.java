package util;

import entities.Pessoa;

public class Calculator {
	
	
	public static float alturaMedia(Pessoa[] pessoas) {
		double soma = 0;
		for(int i = 0; i < pessoas.length; i++) {
			soma += pessoas[i].getAltura();
		}
		
		return (float) soma / pessoas.length;
	}
	
	public static double menores16(Pessoa[] pessoas) {
		double soma = 0;
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getIdade() < 16) {
				soma ++;
			}
		}
		
		return (soma * 100) / pessoas.length;
	}
}
