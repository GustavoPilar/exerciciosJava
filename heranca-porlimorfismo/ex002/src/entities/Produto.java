package entities;

public class Produto {

	private String nome;
	private Double preco;
	
	public Produto() {
		
	}

	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getpreco() {
		return preco;
	}

	public void setpreco(Double preco) {
		this.preco = preco;
	}
	
	// Metodos
	public String precoEtiqueta() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome + ", R$");
		sb.append(String.format("%.2f", preco));
		return sb.toString();
	}
	
}
