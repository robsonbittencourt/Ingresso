package ingresso;

public class DescontoCrianca implements Desconto {
	private static final double DESCONTO_DEZ_PORCENTO = 0.1;
	private static final double DESCONTO_QUINZE_PORCENTO = 0.15;

	@Override
	public double getDescontoSegunda() {
		return DESCONTO_DEZ_PORCENTO;
	}

	@Override
	public double getDescontoTerca() {
		return DESCONTO_QUINZE_PORCENTO;
	}
}
