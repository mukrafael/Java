package br.com.db1start.aula11;

public class Nome {
	
//1 - FUM que receba um texto e devolva ele em LETRAS MAIUSCULAS
	
	public String transformarParaLetraMaiuscula (String nome) {
		return nome.toUpperCase();
	}
	
//2 - FUM que receba um texto e devolva ele em LETRAS MINUSCULAS
	
	public String transformarParaLetraMinuscula (String nome) {
		return nome.toLowerCase();
	}
	
//3 - FUM que receba DB1START e retorne a quantidade de letras que existe nesta palavra
	
	public int somarQuantidadeDeLetra (String nome) {
		return nome.length();
	}

//4 - FUM que receba DB1START (tendo um espaço no inicio e no fim da palavra) e retorne a quantidade de letras que existe

	public int tamanhoDaPalavra (String palavra) {
		palavra = palavra.replaceAll(" ", "");
			return palavra.length();
	}
	
//5 - FUM que retorne o item 4 com a mesma quantidade de letras do item 3.
	
	public int tamanhoComparacao (String nome) {
		nome = nome.replaceAll(" ", "");
			return nome.length();
	}
	
//6 - FUM que receba o seu nome completo e exiba somente as 4 primeiras letras do seu nome
	
	public String primeirasLetrasDoNome (String nome) {
		return nome.substring(0, 4);
	}

//7 - FUM que receba o seu nome completo e exiba a partir da terceira letras do seu nome
	
	public String exibirAposATerceiraLetra (String nome) {
		return nome.substring(3, 26);
	}

//8 - FUM que receba o seu nome completo e exiba somente as 4 ultimas letras do seu nome
	
	public String exibirAsUltimasLetrasDoNome (String nome) {
		return nome.substring(22, 26);
	}

//9 - FUM que receba o seu nome completo e substitua o seu  primeiro nome por ALUNO/ALUNA	
	
	public String trocarPrimeiroNomePorAluno (String nome) {
		return nome.replace("rafael", "aluno");
	}
	
//10 - FUM que receba o seguinte texto "banana, maçã, melancia" e exiba o texto separadamente.

	public String[] separacaoDeTexto (String nome ) {
	    return nome.split(", ");
		}
}
