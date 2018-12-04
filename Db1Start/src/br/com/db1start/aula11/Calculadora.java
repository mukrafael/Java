package br.com.db1start.aula11;

public class Calculadora {

//1 - FUM que some dois números

	public int calcularSoma (int num1, int num2) {
		int soma = num1 + num2;
		return soma;
	}

//2 - FUM que subtraia dois números
	
	public int calcularSub (int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	}
		
//3 - FUM que multiplique dois números 
		
	public int calcularMult (int num1, int num2) {
		int mult = num1 * num2;
		return mult;
	}

//4 - FUM que divida dois números
	
	public int calcularDiv (int num1, int num2) {
		int div = num1 / num2;
		return div;
	}
	
//5 - FUM que diga se o número é par

	public boolean numeroPar (int numero1) {
		if (numero1 % 2 == 0) {
		return true;
		} else {
			return false;
		}
	}
	
//6 - FUM que receba dois números e diga qual é o maior 

	public int numeroMaior (int numero1, int numero2) {
		if (numero1>numero2) {
		return numero1;
		} else { 
			return numero2;
		}
	}
	
//7 - FUM que a partir de um valor inicial, mostre os números de ímpares até 100.
	
	public int numeroImPar (int numero1) {
		int aux = 0;
		for (int i = numero1; i<=100; i++) {
			if((i % 2) != 0) {
				aux++;
			}
		}
		return aux;
	}
}