package ingresso;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestIngresso {
	Ingresso ingressoCrianca;

	@Before
	public void setUp() {
		ingressoCrianca = new IngressoCrianca(5.5);
	}

	@Test
	public void verificarValorDeIngressoCriancaRecemCriado() {
		assertEquals(5.5, ingressoCrianca.getValorDoIngresso(), .0);
	}

	@Test
	public void valorDoIngressoDeveSerZeroQuandoValorPassadoForMenorQueZero() {
		ingressoCrianca = new IngressoCrianca(-5.5);
		assertEquals(0, ingressoCrianca.getValorDoIngresso(), .0);
	}

	@Test
	public void aplicarDescontoDeSegundaParaIngressoCrianca() {
		ingressoCrianca.aplicarDescontoNoValorDoIngresso(ingressoCrianca.getDescontoSegunda());
		assertEquals(4.95, ingressoCrianca.getValorDoIngresso(), .0);
	}

	@Test
	public void aplicarDescontoDeTercaParaIngressosCrianca() {
		ingressoCrianca.aplicarDescontoNoValorDoIngresso(ingressoCrianca.getDescontoTerca());
		assertEquals(4.675, ingressoCrianca.getValorDoIngresso(), .0);
	}
}
