package testes;

import static org.junit.Assert.assertEquals;
import ingresso.Bilheteria;
import ingresso.Ingresso;

import org.junit.Before;
import org.junit.Test;

public class TestBilheteriaCrianca {
	private static final double VALOR_INGRESSO_PADRAO = 5.5;
	Bilheteria bilheteria;
	Ingresso ingressoCrianca;

	@Before
	public void setUp() {
		bilheteria = new Bilheteria();
	}

	@Test
	public void ingressoParaCriancaSegundaDeveTerDezPorcentoDeDesconto() {
		ingressoCrianca = bilheteria.criarIngressoCrianca("25/03/2013");
		assertEquals(4.95, ingressoCrianca.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaCriancaTercaDeveTerQuinzePorcentoDeDesconto() {
		ingressoCrianca = bilheteria.criarIngressoCrianca("26/03/2013");
		assertEquals(4.675, ingressoCrianca.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaCriancaQuartaDeveTerTrintaPorcentoDeDesconto() {
		ingressoCrianca = bilheteria.criarIngressoCrianca("27/03/2013");
		assertEquals(3.85, ingressoCrianca.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaCriancaQuintaNaoDeveTerDesconto() {
		ingressoCrianca = bilheteria.criarIngressoCrianca("28/03/2013");
		assertEquals(VALOR_INGRESSO_PADRAO, ingressoCrianca.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaCriancaSextaDeveTerOnzePorcentoDeDesconto() {
		ingressoCrianca = bilheteria.criarIngressoCrianca("29/03/2013");
		assertEquals(4.895, ingressoCrianca.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaCriancaSabadoNaoDeveTerDesconto() {
		ingressoCrianca = bilheteria.criarIngressoCrianca("30/03/2013");
		assertEquals(VALOR_INGRESSO_PADRAO, ingressoCrianca.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaCriancaDomingoNaoDeveTerDesconto() {
		ingressoCrianca = bilheteria.criarIngressoCrianca("31/03/2013");
		assertEquals(VALOR_INGRESSO_PADRAO, ingressoCrianca.getValorDoIngresso(), .0);
	}
}
