package descontos;

public class DescontoEstudante extends Desconto {
	private double descontoCarteirinha = 35;

	public DescontoEstudante() {
		this.valorDoIngresso = 8;
		this.descontoSegunda = 10;
		this.descontoTerca = 5;
		this.descontoQuarta = 50;
		this.descontoQuinta = 30;
	}

	@Override
	public void aplicarDescontoSegundaNoIngresso() {
		descontoSegunda = getMaiorDesconto(descontoCarteirinha, descontoSegunda);
		aplicarDescontoNoValorDoIngresso(descontoSegunda);
	}

	@Override
	public void aplicarDescontoTercaNoIngresso() {
		descontoTerca = getMaiorDesconto(descontoCarteirinha, descontoTerca);
		aplicarDescontoNoValorDoIngresso(descontoTerca);
	}

	@Override
	public void aplicarDescontoQuartaNoIngresso() {
		descontoQuarta = getMaiorDesconto(descontoCarteirinha, descontoQuarta);
		aplicarDescontoNoValorDoIngresso(descontoQuarta);
	}

	@Override
	public void aplicarDescontoQuintaNoIngresso() {
		descontoQuinta = getMaiorDesconto(descontoCarteirinha, descontoQuinta);
		aplicarDescontoNoValorDoIngresso(descontoQuinta);
	}

	@Override
	public void aplicarDescontoSextaNoIngresso() {
		descontoSexta = getMaiorDesconto(descontoCarteirinha, descontoSexta);
		aplicarDescontoNoValorDoIngresso(descontoSexta);
	}

	public double getMaiorDesconto(double primeiroDesconto, double segundoDesconto) {
		double maiorDesconto = primeiroDesconto;

		if (segundoDesconto > primeiroDesconto)
			maiorDesconto = segundoDesconto;

		return maiorDesconto;
	}
}
