package br.com.db1start.aula11;

import org.junit.Assert;
import org.junit.Test;

public class NomeTest {
	
// 1	
	@Test
	public void deveTransformarParaLetraMaiuscula() {
		Nome nome = new Nome();
		String valorTransformado = nome.transformarParaLetraMaiuscula("rafael amaral");
		Assert.assertEquals("RAFAEL AMARAL", valorTransformado);
	}
//2
	@Test
	public void deveTransformarParaLetraMinuscula() {
		Nome nome = new Nome();
		String valorTransformado = nome.transformarParaLetraMinuscula("RAFAEL AMARAL");
		Assert.assertEquals("rafael amaral", valorTransformado);
	}
//3
	@Test
	public void deveSomarQuantidadeDeLetras() {
		Nome nome = new Nome();
		int tamanhoDoNome = nome.somarQuantidadeDeLetra("DB1START");
		Assert.assertEquals(8, tamanhoDoNome);
	}
//4 
	@Test
	public void deveRetornaTamanhoDaPalavra() {
		Nome nome = new Nome();
		int tamanhoDaPalavra = nome.tamanhoDaPalavra(" DB1START ");
		Assert.assertEquals(8, tamanhoDaPalavra);
	}
//5
	@Test
	public void deveRetronarTamanhoDaTres() {
		Nome nome = new Nome();
		int tamanhoDoNome = nome.tamanhoComparacao(" DB1START ");
		Assert.assertEquals(8, tamanhoDoNome);
	}
//6
	@Test
	public void deveRetornarAsPrimeirasLetrasDoNome() {
		Nome nome = new Nome();
		String primeirasLetras = nome.primeirasLetrasDoNome("rafael espricigo do amaral");
		Assert.assertEquals("rafa", primeirasLetras);
	}
//7
	@Test
	public void deveRetornarNomeAposATerceiraLetra() {
		Nome nome = new Nome();
		String aposAterceiraLetra = nome.exibirAposATerceiraLetra("rafael espricigo do amaral");
		Assert.assertEquals("ael espricigo do amaral", aposAterceiraLetra);
	}
//8
	@Test
	public void deveExibirAsUltimasLetrasDoNome() {
		Nome nome = new Nome();
		String exibirUltimasLetras = nome.exibirAsUltimasLetrasDoNome("rafael espricigo do amaral");
		Assert.assertEquals("aral", exibirUltimasLetras);
	}
//9
	@Test
	public void deveTrocarPrimeiroNomePorAluno() {
		Nome nome = new Nome();
		String trocarNome = nome.trocarPrimeiroNomePorAluno("rafael espricigo do amaral");
		Assert.assertEquals("aluno espricigo do amaral", trocarNome);
	}
//10
	@Test
	public void deveSepararOTexto() {
		Nome nome = new Nome();
		String[] separarTexto = nome.separacaoDeTexto("banana, maçã, melancia");
		Assert.assertEquals("banana, maçã, melancia", separarTexto);
	}
}
