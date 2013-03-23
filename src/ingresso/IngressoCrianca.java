package ingresso;

public class IngressoCrianca extends Ingresso {

	public IngressoCrianca(double valorDoIngresso) {
		desconto = new DescontoCrianca();
		if (valorDoIngresso >= 0)
			this.valorDoIngresso = valorDoIngresso;
	}
}
