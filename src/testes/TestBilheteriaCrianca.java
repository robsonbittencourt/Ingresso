package testes;

import static org.junit.Assert.assertEquals;
import ingresso.Bilheteria;
import ingresso.Ingresso;

import org.junit.Before;
import org.junit.Test;

public class TestBilheteriaCrianca {
	Bilheteria bilheteria;
	Ingresso ingressoCrianca;

	@Before
	public void setUp() {
		bilheteria = new Bilheteria();
	}

	@Test
	public void ingressoParaCriancaEmSegunda_25_03_2013_DeveTerDezPorcentoDeDesconto() {
		ingressoCrianca = bilheteria.criarIngressoCrianca("25/03/2013");
		assertEquals(4.95, ingressoCrianca.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaCriancaEmTerca_26_03_2013_DeveTerQuinzePorcentoDeDesconto() {
		ingressoCrianca = bilheteria.criarIngressoCrianca("26/03/2013");
		assertEquals(4.675, ingressoCrianca.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaCriancaEmQuarta_27_03_2013_DeveTerTrintaPorcentoDeDesconto() {
		ingressoCrianca = bilheteria.criarIngressoCrianca("27/03/2013");
		assertEquals(3.85, ingressoCrianca.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaCriancaEmQuinta_28_03_2013_NaoDeveTerDesconto() {
		ingressoCrianca = bilheteria.criarIngressoCrianca("28/03/2013");
		assertEquals(5.5, ingressoCrianca.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaCriancaEmSexta_29_03_2013_DeveTerOnzePorcentoDeDesconto() {
		ingressoCrianca = bilheteria.criarIngressoCrianca("29/03/2013");
		assertEquals(4.895, ingressoCrianca.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaCriancaEmSabado_30_03_2013_NaoDeveTerDesconto() {
		ingressoCrianca = bilheteria.criarIngressoCrianca("30/03/2013");
		assertEquals(5.5, ingressoCrianca.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaCriancaEmDomingo_31_03_2013_NaoDeveTerDesconto() {
		ingressoCrianca = bilheteria.criarIngressoCrianca("31/03/2013");
		assertEquals(5.5, ingressoCrianca.getValorDoIngresso(), .0);
	}
}
