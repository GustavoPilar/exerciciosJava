package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {

	public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	private LocalDateTime momento;
	private StatusPedido status;
	List<PedidoItem> items = new ArrayList<>();
	
	private Cliente cliente;
	
	public Pedido(LocalDateTime momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public LocalDateTime getMomento() {
		return momento;
	}

	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public List<PedidoItem> getItems() {
		return items;
	}

	public void addItem(PedidoItem item) {
		items.add(item);
	}
	
	public void removeItem(PedidoItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double soma = 0.0;
		for(PedidoItem i : items) {
			soma += i.subTotal();
		}
		return soma;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nSumário do pedido:\n");
		sb.append("Momento: " + fmt.format(momento) + "\n");
		
		status = StatusPedido.PAGAMENTO_PENDENTE;
		
		sb.append("Status: " + status + "\n");
		sb.append("Cliente: " + cliente + "\n");
		sb.append("Itens pedidos:\n");
		for(PedidoItem i : items) {
			sb.append(i + "\n");
		}
		sb.append("Preço total: R$" + String.format("%.2f", total()));
		return sb.toString();
	}
		
}
