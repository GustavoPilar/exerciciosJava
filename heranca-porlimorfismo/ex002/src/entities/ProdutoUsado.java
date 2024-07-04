package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto{
	
	public final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private LocalDate dataFabricacao;
	
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, Double preco, LocalDate dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	// Getters e Setters
	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	// Metodos
	@Override
	public final String precoEtiqueta() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getNome() + ", R$");
		sb.append(String.format("%.2f ", super.getpreco()));
		sb.append("(Data de fabricação: " + fmt.format(dataFabricacao) + ")");
		return sb.toString();
	}
	
}
