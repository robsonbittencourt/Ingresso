package ingresso;

public abstract class Ingresso {
	protected double valorDoIngresso;
	protected Desconto desconto;
	
	public Ingresso(double valorDoIngresso) {
		if (valorDoIngresso >= 0)
			this.valorDoIngresso = valorDoIngresso;
	}	

	public double getValorDoIngresso() {
		return valorDoIngresso;
	}

	public final void aplicarDescontoNoValorDoIngresso(double descontoPorcentagem) {
		valorDoIngresso -= getValorDoDesconto(descontoPorcentagem);
	}

	public final double getValorDoDesconto(double descontoPorcentagem) {
		return (valorDoIngresso * descontoPorcentagem) / 100;
	}
	
	public double getDescontoSegunda() {
		return desconto.getDescontoSegunda();
	}

	public double getDescontoTerca() {
		return desconto.getDescontoTerca();
	}

	public double getDescontoQuarta() {
		return desconto.getDescontoQuarta();
	}

	public double getDescontoQuinta() {
		return desconto.getDescontoQuinta();
	}

	public double getDescontoSexta() {
		return desconto.getDescontoSexta();
	}
}
