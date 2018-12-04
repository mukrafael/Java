package br.com.db1start.aula10;

public class MinhaPrimeiraClasse {  //As Classes podem ser private ou protected
	
	public static void main(String[] args) {
/*		System.out.println("Ola Mundo!");
		Integer numeroASerVerificado = 3;
		boolean eVerdade = numeroASerVerificado == 3;
		boolean eVerdadeNumeroImpar = numeroASerVerificado % 2 > 0; 
		System.out.println(eVerdade);
		System.out.println(eVerdadeNumeroImpar);
*/

		Integer resultadoDaSoma = MinhaPrimeiraClasse.somar(10, 5);
		double resultadoDaDivisao = MinhaPrimeiraClasse.dividir(50, 20);
		Integer resultadoDaSubracao = MinhaPrimeiraClasse.subtracao(10, 5);
		Integer resultadoDaMultiplicacao = MinhaPrimeiraClasse.multiplicacao(2, 8);
		System.out.println("O Resultado da Soma é " + resultadoDaSoma);
		System.out.println("O Resultado da Divisão é " + resultadoDaDivisao);
		System.out.println("O Resultado da Subtração é " + resultadoDaSubracao);
		System.out.println("O Resultado da Multiplicação é " + resultadoDaMultiplicacao);
		
	}
	public static Integer somar (Integer num1, Integer num2) {
		return num1 + num2;
	}
	public static void imprimirValor (Integer valor) {
		System.out.println(valor);
	}
	public static double dividir (double num1, double num2) {
		return num1 / num2;
	}
	public static void imprimirValor (double valor) {
		System.out.println(valor);
	}
	public static Integer subtracao (Integer num1, Integer num2) {
		return num1 / num2;
	}
	public static void imprimir (Integer valor) {
		System.out.println(valor);
	}
	public static Integer multiplicacao (Integer num1, Integer num2) {
		return num1 * num2;
	}
	public static void imprimir (double valor) {
		System.out.println(valor);
	}
}