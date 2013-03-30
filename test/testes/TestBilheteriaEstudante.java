package testes;

import static org.junit.Assert.assertEquals;
import ingresso.Bilheteria;
import ingresso.Ingresso;

import org.junit.Before;
import org.junit.Test;

public class TestBilheteriaEstudante {
	private static final double VALOR_INGRESSO_PADRAO = 8;
	Bilheteria bilheteria;
	Ingresso ingressoEstudante;
	

	@Before
	public void setUp() {
		bilheteria = new Bilheteria();
	}

	@Test
	public void ingressoParaEstudanteSegundaDeveTerTrintaCincoPorcentoDeDesconto() {
		ingressoEstudante = bilheteria.criarIngressoEstudante("25/03/2013");
		assertEquals(5.2, ingressoEstudante.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaEstudanteTercaDeveTerTrintaCincoPorcentoDeDesconto() {
		ingressoEstudante = bilheteria.criarIngressoEstudante("26/03/2013");
		assertEquals(5.2, ingressoEstudante.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaEstudanteQuartaDeveTerCinquentaPorcentoDeDesconto() {
		ingressoEstudante = bilheteria.criarIngressoEstudante("27/03/2013");
		assertEquals(4, ingressoEstudante.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaEstudanteQuintaDeveTerTrintaCincoPorcentoDeDesconto() {
		ingressoEstudante = bilheteria.criarIngressoEstudante("28/03/2013");
		assertEquals(5.2, ingressoEstudante.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaEstudanteSextaDeveTerTrintaCincoPorcentoDeDesconto() {
		ingressoEstudante = bilheteria.criarIngressoEstudante("29/03/2013");
		assertEquals(5.2, ingressoEstudante.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaEstudanteSabadoNaoDeveTerDesconto() {
		ingressoEstudante = bilheteria.criarIngressoEstudante("30/03/2013");
		assertEquals(VALOR_INGRESSO_PADRAO, ingressoEstudante.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaEstudanteDomingoNaoDeveTerDesconto() {
		ingressoEstudante = bilheteria.criarIngressoEstudante("31/03/2013");
		assertEquals(VALOR_INGRESSO_PADRAO, ingressoEstudante.getValorDoIngresso(), .0);
	}
}
