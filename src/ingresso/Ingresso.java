package ingresso;

public abstract class Ingresso {
	protected double valorDoIngresso = 0;
	protected Desconto desconto;

	public double getValorDoIngresso() {
		return valorDoIngresso;
	}

	public void setValorDoIngresso(double valorDoIngresso) {
		this.valorDoIngresso = valorDoIngresso;
	}

	public void aplicarDescontoNoValorDoIngresso(double descontoDoDia) {
		double valorDoDesconto = valorDoIngresso * descontoDoDia;
		valorDoIngresso -= valorDoDesconto;
	}

	public double getDescontoSegunda() {
		return desconto.getDescontoSegunda();
	}

	public double getDescontoTerca() {
		return desconto.getDescontoTerca();
	}
}
