package ingresso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import descontos.Desconto;
import descontos.DescontoCrianca;
import descontos.DescontoEstudante;
import descontos.DescontoIdoso;

public class Bilheteria {
	private static final int DOMINGO = 1;
	private static final int SEGUNDA = 2;
	private static final int TERCA = 3;
	private static final int QUARTA = 4;
	private static final int QUINTA = 5;
	private static final int SEXTA = 6;
	private static final int SABADO = 7;
	private Desconto desconto;

	public Ingresso criarIngressoCrianca(String diaMesAno) {
		return criarIngresso(new DescontoCrianca(), diaMesAno, false);
	}
	
	public Ingresso criarIngressoEstudante(String diaMesAno) {
		return criarIngresso(new DescontoEstudante(), diaMesAno, false);
	}

	public Ingresso criarIngressoIdoso(String diaMesAno, boolean isFeriado) {
		return criarIngresso(new DescontoIdoso(), diaMesAno, isFeriado);
	}

	private Ingresso criarIngresso(Desconto tipoDeDesconto, String diaMesAno, boolean isFeriado) {
		desconto = tipoDeDesconto;
		int diaDaSemana = getDiaDaSemana(diaMesAno);

		if (isFeriado && diaDaSemana == SEXTA) {
			aplicarDescontoNoValorDoIngresso(DOMINGO);
		} else {
			aplicarDescontoNoValorDoIngresso(diaDaSemana);
		}

		return new Ingresso(desconto.getValorDoIngresso());
	}

    private int getDiaDaSemana(String diaMesAno) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;

		try {
			date = dateFormat.parse(diaMesAno);
		} catch (ParseException e) {
			return -1;
		}
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(date);

		return calendario.get(Calendar.DAY_OF_WEEK);
	}

	private void aplicarDescontoNoValorDoIngresso(int diaDaSemana) {
		switch (diaDaSemana) {
		case DOMINGO:
			desconto.aplicarDescontoFinaisDeSemanaFeriadosNoIngresso();
			break;
		case SEGUNDA:
			desconto.aplicarDescontoSegundaNoIngresso();
			break;
		case TERCA:
			desconto.aplicarDescontoTercaNoIngresso();
			break;
		case QUARTA:
			desconto.aplicarDescontoQuartaNoIngresso();
			break;
		case QUINTA:
			desconto.aplicarDescontoQuintaNoIngresso();
			break;
		case SEXTA:
			desconto.aplicarDescontoSextaNoIngresso();
			break;
		case SABADO:
			desconto.aplicarDescontoFinaisDeSemanaFeriadosNoIngresso();
			break;
		}
	}
}