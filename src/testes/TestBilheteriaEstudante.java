package testes;

import static org.junit.Assert.assertEquals;
import ingresso.Bilheteria;
import ingresso.Ingresso;

import org.junit.Before;
import org.junit.Test;

public class TestBilheteriaEstudante {
	Bilheteria bilheteria;
	Ingresso ingressoEstudante;

	@Before
	public void setUp() {
		bilheteria = new Bilheteria();
	}

	@Test
	public void ingressoParaEstudanteEmSegunda_25_03_2013_DeveTerTrintaCincoPorcentoDeDesconto() {
		ingressoEstudante = bilheteria.criarIngressoEstudante("25/03/2013");
		assertEquals(5.2, ingressoEstudante.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaEstudanteEmTerca_26_03_2013_DeveTerTrintaCincoPorcentoDeDesconto() {
		ingressoEstudante = bilheteria.criarIngressoEstudante("26/03/2013");
		assertEquals(5.2, ingressoEstudante.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaEstudanteEmQuarta_27_03_2013_DeveTerCinquentaPorcentoDeDesconto() {
		ingressoEstudante = bilheteria.criarIngressoEstudante("27/03/2013");
		assertEquals(4, ingressoEstudante.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaEstudanteEmQuinta_28_03_2013_DeveTerTrintaCincoPorcentoDeDesconto() {
		ingressoEstudante = bilheteria.criarIngressoEstudante("28/03/2013");
		assertEquals(5.2, ingressoEstudante.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaEstudanteEmSexta_29_03_2013_DeveTerTrintaCincoPorcentoDeDesconto() {
		ingressoEstudante = bilheteria.criarIngressoEstudante("29/03/2013");
		assertEquals(5.2, ingressoEstudante.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaEstudanteEmSabado_30_03_2013_NaoDeveTerDesconto() {
		ingressoEstudante = bilheteria.criarIngressoEstudante("30/03/2013");
		assertEquals(8, ingressoEstudante.getValorDoIngresso(), .0);
	}

	@Test
	public void ingressoParaEstudanteEmDomingo_31_03_2013_NaoDeveTerDesconto() {
		ingressoEstudante = bilheteria.criarIngressoEstudante("31/03/2013");
		assertEquals(8, ingressoEstudante.getValorDoIngresso(), .0);
	}
}
