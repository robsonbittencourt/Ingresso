package ingresso;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestIngresso {
	Ingresso ingressoCrianca;
	Ingresso ingressoEstudante;
	Ingresso ingressoIdoso;
	double descontoEmPorcentagem;
	
	@Before
	public void setUp() {
		ingressoCrianca = new IngressoCrianca(5.50);
		ingressoEstudante = new IngressoEstudante(8.00);
		ingressoIdoso = new IngressoIdoso(6.00);
	}

	@Test
	public void verificarValorDeIngressoCriancaRecemCriado() {
		assertEquals(5.5, ingressoCrianca.getValorDoIngresso(), .0);
	}

	@Test
	public void valorDoIngressoDeveSerZeroQuandoValorPassadoForMenorQueZero() {
		ingressoCrianca = new IngressoCrianca(-5.50);
		assertEquals(0, ingressoCrianca.getValorDoIngresso(), .0);
	}
	
	@Test
	public void verificarSeValoresDosDescontosCriancaEstaoCorretos() {
		assertEquals(10, ingressoCrianca.getDescontoSegunda(), .0);
		assertEquals(15, ingressoCrianca.getDescontoTerca(), .0);
		assertEquals(30, ingressoCrianca.getDescontoQuarta(), .0);
		assertEquals(0, ingressoCrianca.getDescontoQuinta(), .0);
		assertEquals(11, ingressoCrianca.getDescontoSexta(), .0);
	}
	
	@Test
	public void verificarSeValoresDosDescontosIdosoEstaoCorretos() {
		assertEquals(10, ingressoIdoso.getDescontoSegunda(), .0);
		assertEquals(15, ingressoIdoso.getDescontoTerca(), .0);
		assertEquals(40, ingressoIdoso.getDescontoQuarta(), .0);
		assertEquals(30, ingressoIdoso.getDescontoQuinta(), .0);
		assertEquals(0, ingressoIdoso.getDescontoSexta(), .0);
	}
	
	@Test
	public void verificarSeValoresDosDescontosEstudanteEstaoCorretos() {
		assertEquals(35, ingressoEstudante.getDescontoSegunda(), .0);
		assertEquals(35, ingressoEstudante.getDescontoTerca(), .0);
		assertEquals(50, ingressoEstudante.getDescontoQuarta(), .0);
		assertEquals(35, ingressoEstudante.getDescontoQuinta(), .0);
		assertEquals(35, ingressoEstudante.getDescontoSexta(), .0);
	}
	
	@Test
	public void verificarSeValoresDeDescontoEstaoCorretosEmRelacaoPorcentagemDeDesconto() {
		assertEquals(2.75, ingressoCrianca.getValorDoDesconto(50), .0);
	}
	
	@Test
	public void verificarSeAplicacaoDosDescontosEstaCorreta() {
		ingressoCrianca.aplicarDescontoNoValorDoIngresso(10);
		assertEquals(4.95, ingressoCrianca.getValorDoIngresso(), .0);
	}
}
