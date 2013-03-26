package ingresso;

public class DescontoEstudante extends Desconto {
	private double descontoCarteirinha = 35;
	
	public DescontoEstudante() {
		this.descontoSegunda = 10;
		this.descontoTerca = 5;
		this.descontoQuarta = 50;
		this.descontoQuinta = 30;
		this.descontoSexta = 0;
	}
	
	@Override
	public double getDescontoSegunda() {
		return getMaiorDesconto(descontoSegunda); 
	}
	
	private double getMaiorDesconto(double descontoDoDia) {
		double maiorDesconto = descontoCarteirinha;
				
		if (descontoDoDia > descontoCarteirinha)
			maiorDesconto = descontoDoDia;
		
		return maiorDesconto;
	}

	@Override
	public double getDescontoTerca() {
		return getMaiorDesconto(descontoTerca);
	}
	
	@Override
	public double getDescontoQuarta() {
		return getMaiorDesconto(descontoQuarta);
	}
	
	@Override
	public double getDescontoQuinta() {
		return getMaiorDesconto(descontoQuinta);
	}
	
	@Override
	public double getDescontoSexta() {
		return getMaiorDesconto(descontoSexta);
	}
}
