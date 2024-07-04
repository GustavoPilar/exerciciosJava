package entities;

public class Tercerizado extends Empregado{
	
	protected Double bonusAdicional;
	
	public Tercerizado(String nome, Integer horas, Double valorPorHora, Double bonusAdicional) {
		super(nome, horas, valorPorHora);
		this.bonusAdicional = bonusAdicional;
	}
	
	@Override
	public final Double pagamento() {
		Double valor = (bonusAdicional / 10) * 11;
		return super.pagamento() + valor;
	}

	@Override
	public final String toString() {
		return super.getNome() + ", R$" + String.format("%.2f", pagamento());
	}
	
	

}
