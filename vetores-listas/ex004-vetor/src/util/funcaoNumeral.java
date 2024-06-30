package util;

public class funcaoNumeral {
	public static boolean numeroPar(int numero) {
		if(numero % 2 == 0) {
			return true;
		} else  {
			return false;
		}
	}
	
	public static int qtdPares(int[] numeros) {
		int soma = 0;
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				soma++;
			}
		}
		return soma;
	}
}
