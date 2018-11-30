package br.com.db1start.aula10;

public class MinhaPrimeiraClasse {  //As Classes podem ser private ou protected
	
	public static void main(String[] args) {
	/*	System.out.println("Ola Mundo!");
		Integer numeroASerVerificado = 3;
		boolean eVerdade = numeroASerVerificado == 3;
		boolean eVerdadeNumeroImpar = numeroASerVerificado % 2 > 0; 
		System.out.println(eVerdade);
		System.out.println(eVerdadeNumeroImpar);
*/
		Integer resultadoDaSoma = MinhaPrimeiraClasse.somar(1 , 10);
		Integer resultadoDaDivisao = MinhaPrimeiraClasse.dividir(20, 2);
	//	Integer resultadoDaSubtracao = MinhaPrimeiraClasse.subtrair(30, 8);
		System.out.println(resultadoDaSoma);
		System.out.println(resultadoDaDivisao);
//		System.out.println(resultadoDaSubtracao);
	}
	public static Integer somar (Integer numeroUm, Integer numeroDois) {
		return numeroUm + numeroDois;
	}
	public static void imprimirValor(double valor) {
		System.out.println(valor);
	}
	
	
	public static Integer dividir (Integer numeroUm, Integer numeroDois) {
		return numeroUm / numeroDois;
	}
	public static void imprimirValor(Integer valor) {
		System.out.println(valor);
	}
	
}


/*Integer soma = ValorA + ValorB;
System.out.println(soma);
Integer vezes = ValorA * ValorB;
System.out.println(vezes);
Integer dividir = ValorA / ValorB;
System.out.println(dividir);
Integer menos = ValorA - ValorB;
System.out.println(menos);	
*/