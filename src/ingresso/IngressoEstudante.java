package ingresso;

public class IngressoEstudante extends Ingresso {

	public IngressoEstudante(double valorDoIngresso) {
		super(valorDoIngresso);
		desconto = new DescontoEstudante();
	}
}
