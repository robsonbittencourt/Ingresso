package testes;

import static org.junit.Assert.assertEquals;
import ingresso.Bilheteria;
import ingresso.Ingresso;

import org.junit.Before;
import org.junit.Test;

public class TestBilheteriaIdoso {
	Bilheteria bilheteria;
	Ingresso ingressoIdoso;

	@Before
	public void setUp() {
		bilheteria = new Bilheteria();
	}

	@Test
	public void ingressoParaIdosoSegundaDeveTerDezPorcentoDeDesconto() {
		ingressoIdoso = bilheteria.criarIngressoIdoso("25/03/2013", false);
		assertEquals(5.4, ingressoIdoso.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaIdosoTercaDeveTerQuinzePorcentoDeDesconto() {
		ingressoIdoso = bilheteria.criarIngressoIdoso("26/03/2013", false);
		assertEquals(5.1, ingressoIdoso.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaIdosoQuartaDeveTerQuarentaPorcentoDeDesconto() {
		ingressoIdoso = bilheteria.criarIngressoIdoso("27/03/2013", false);
		assertEquals(3.6, ingressoIdoso.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaIdosoQuintaDeveTerTrintaPorcentoDeDesconto() {
		ingressoIdoso = bilheteria.criarIngressoIdoso("28/03/2013", false);
		assertEquals(4.2, ingressoIdoso.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaIdosoSextaNaoDeveTerDesconto() {
		ingressoIdoso = bilheteria.criarIngressoIdoso("29/03/2013", false);
		assertEquals(6, ingressoIdoso.getValorDoIngresso(), .0);
	}
	
	@Test
	public void ingressoParaIdosoSextaFeriadoDeveTerCincoPorcentoDeDesconto() {
		ingressoIdoso = bilheteria.criarIngressoIdoso("29/03/2013", true);
		assertEquals(5.7, ingressoIdoso.getValorDoIngresso(), .0);
	}
	
	@Test
	public void ingressoParaIdosoSabadoDeveTerCincoPorcentoDeDesconto() {
		ingressoIdoso = bilheteria.criarIngressoIdoso("30/03/2013", false);
		assertEquals(5.7, ingressoIdoso.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaIdosoDomingoDeveTerCincoPorcentoDeDesconto() {
		ingressoIdoso = bilheteria.criarIngressoIdoso("31/03/2013", false);
		assertEquals(5.7, ingressoIdoso.getValorDoIngresso(), .0);
	}
}
