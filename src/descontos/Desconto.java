package descontos;


public abstract class Desconto {
	protected double valorDoIngresso, descontoSegunda, descontoTerca, descontoQuarta,
			descontoQuinta, descontoSexta, descontoFinaisDeSemanaFeriados;
	
	public double getValorDoIngresso() {
		return valorDoIngresso;
	}
	
	public void aplicarDescontoSegundaNoIngresso() {
		aplicarDescontoNoValorDoIngresso(descontoSegunda);
	}

	public void aplicarDescontoTercaNoIngresso() {
		aplicarDescontoNoValorDoIngresso(descontoTerca);
	}
	
	public void aplicarDescontoQuartaNoIngresso() {
		aplicarDescontoNoValorDoIngresso(descontoQuarta);
	}
	
	public void aplicarDescontoQuintaNoIngresso() {
		aplicarDescontoNoValorDoIngresso(descontoQuinta);
	}
	
	public void aplicarDescontoSextaNoIngresso() {
		aplicarDescontoNoValorDoIngresso(descontoSexta);
	}
	
	public void aplicarDescontoFinaisDeSemanaFeriadosNoIngresso() {
		aplicarDescontoNoValorDoIngresso(descontoFinaisDeSemanaFeriados);
	}
	
	protected void aplicarDescontoNoValorDoIngresso(double descontoDoDia) {
		valorDoIngresso -= (valorDoIngresso * descontoDoDia) / 100;
	}
}
