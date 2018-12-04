package br.com.db1start.aula11;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void deveRetornarSomaDeDoisNumeros() {
		Calculadora soma = new Calculadora();
		int somaDeValores = soma.calcularSoma(5, 5);
		Assert.assertEquals(10, somaDeValores);
	}
	
	@Test
	public void deveRetornarSubtracaoDeDoisNumeros() {
		Calculadora sub = new Calculadora();
		int subtracaoDeValores = sub.calcularSub(10, 5);
		Assert.assertEquals(5, subtracaoDeValores);
	}
	
	@Test
	public void deveRetornarMultiplicacaoDeDoisNumeros() {
		Calculadora mult = new Calculadora();
		int multiplicacaoDeValores = mult.calcularMult(10, 2);
		Assert.assertEquals(20, multiplicacaoDeValores);
	}
	
	@Test
	public void deveRetornarDivisaoDeDoisNumeros() {
		Calculadora div = new Calculadora();
		int divisaoDeValores = div.calcularDiv(10, 5);
		Assert.assertEquals(2, divisaoDeValores);
	}
	
	@Test
	public void deveVerificarPar() {
		Calculadora par = new Calculadora();
		boolean verificarPar = par.numeroPar(2);
		Assert.assertTrue(verificarPar);
	}
	
	@Test
	public void deveVerificarMaior() {
		Calculadora maior = new Calculadora();
		int numeroMaior = maior.numeroMaior(5, 3);
		Assert.assertEquals(5, numeroMaior);
	}
	
	@Test
	public void deveVerificarImpar() {
		Calculadora impar = new Calculadora();
		int numeroImpar = impar.numeroImPar(1);
		Assert.assertEquals(50, numeroImpar);
	}
}
