package ingresso;

public class IngressoCrianca extends Ingresso {

	public IngressoCrianca(double valorDoIngresso) {
		super(valorDoIngresso);
		desconto = new DescontoCrianca();		
	}
}
