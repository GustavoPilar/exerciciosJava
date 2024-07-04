package entities;

public final class ProdutoImportado extends Produto {

	private Double taxaAlfandega;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}
	
	//Getters e Setters
	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	// Metodos
	public final Double precoTotal() {
		return super.getpreco() + taxaAlfandega;
	}
	
	@Override
	public final String precoEtiqueta() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getNome() + ", R$");
		sb.append(String.format("%.2f ", precoTotal()));
		sb.append("(Taxa de alfandega: R$" + String.format("%.2f)", taxaAlfandega));
		return sb.toString();
	}
	
}
