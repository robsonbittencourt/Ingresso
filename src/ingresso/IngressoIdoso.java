package ingresso;

public class IngressoIdoso extends Ingresso {

	public IngressoIdoso(double valorDoIngresso) {
		super(valorDoIngresso);
		desconto = new DescontoIdoso();
	}
}
