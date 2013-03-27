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
	public void ingressoParaIdosoEmSegunda_25_03_2013_DeveTerDezPorcentoDeDesconto() {
		ingressoIdoso = bilheteria.criarIngressoIdoso("25/03/2013", false);
		assertEquals(5.4, ingressoIdoso.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaIdosoEmTerca_26_03_2013_DeveTerQuinzePorcentoDeDesconto() {
		ingressoIdoso = bilheteria.criarIngressoIdoso("26/03/2013", false);
		assertEquals(5.1, ingressoIdoso.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaIdosoEmQuarta_27_03_2013_DeveTerQuarentaPorcentoDeDesconto() {
		ingressoIdoso = bilheteria.criarIngressoIdoso("27/03/2013", false);
		assertEquals(3.6, ingressoIdoso.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaIdosoEmQuinta_28_03_2013_DeveTerTrintaPorcentoDeDesconto() {
		ingressoIdoso = bilheteria.criarIngressoIdoso("28/03/2013", false);
		assertEquals(4.2, ingressoIdoso.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaIdosoEmSexta_29_03_2013_NaoDeveTerDesconto() {
		ingressoIdoso = bilheteria.criarIngressoIdoso("29/03/2013", false);
		assertEquals(6, ingressoIdoso.getValorDoIngresso(), .0);
	}
	
	@Test
	public void ingressoParaIdosoEmSextaFeriado_29_03_2013_DeveTerCincoPorcentoDeDesconto() {
		ingressoIdoso = bilheteria.criarIngressoIdoso("29/03/2013", true);
		assertEquals(5.7, ingressoIdoso.getValorDoIngresso(), .0);
	}
	
	@Test
	public void ingressoParaIdosoEmSabado_30_03_2013_DeveTerCincoPorcentoDeDesconto() {
		ingressoIdoso = bilheteria.criarIngressoIdoso("30/03/2013", false);
		assertEquals(5.7, ingressoIdoso.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaIdosoEmDomingo_31_03_2013_DeveTerCincoPorcentoDeDesconto() {
		ingressoIdoso = bilheteria.criarIngressoIdoso("31/03/2013", false);
		assertEquals(5.7, ingressoIdoso.getValorDoIngresso(), .0);
	}
}
