package entities;

public class PedidoItem {
	
	private Double preco;
	private Integer quantidade;
	
	private Produto produto;
	
	public PedidoItem(Double preco, Integer quantidade, Produto produto) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double subTotal() {
		return quantidade * preco;
	}

	@Override
	public String toString() {
		return produto + ", subtotal: R$" + String.format("%.2f", subTotal());
	}
	
	
	
}
