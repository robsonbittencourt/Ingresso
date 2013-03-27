package descontos;

public class DescontoIdoso extends Desconto {
	double descontoFeriado;
	
	public DescontoIdoso() {
		this.valorDoIngresso = 6;
		this.descontoSegunda = 10;
		this.descontoTerca = 15;
		this.descontoQuarta = 40;
		this.descontoQuinta = 30;
		this.descontoFinaisDeSemanaFeriados = 5;
	}
}
