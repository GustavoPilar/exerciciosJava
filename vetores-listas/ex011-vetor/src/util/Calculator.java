package util;

import entities.Pessoa;

public class Calculator {
	
	public static float maiorAltura(Pessoa[] pessoas) {
		float maior = 0;
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getAltura() > maior) {
				maior = pessoas[i].getAltura();
			}
		}
		return maior;
	}
	
	public static float menorAltura(Pessoa[] pessoas) {
		float menor = maiorAltura(pessoas);
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getAltura() < menor) {
				menor = pessoas[i].getAltura();
			}
		}
		return menor;
	}
	
	public static double mediaAlturaMulheres(Pessoa[] pessoas) {
		double soma = 0.0;
		double mulheres = 0.0;
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getSexo() == 'F') {
				soma += pessoas[i].getAltura();
				mulheres++;
			}
		}
		return soma / mulheres;
	}
	
	public static int qtdHomens(Pessoa[] pessoas) {
		int homens = 0;
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getSexo() == 'M') {
				homens++;
			}
		}
		return homens;
	}
}
