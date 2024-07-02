package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Pedido;
import entities.PedidoItem;
import entities.Produto;
import entities.enums.StatusPedido;

public class Main {

	public static void main(String[] args) {

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de nascimento (DD/MM/AAAA): ");
		String data = sc.next();

		Cliente cliente = new Cliente(nome, email, LocalDate.parse(data, fmt));
		
		System.out.println("\nDados do pedido:");
		Pedido pedido = new Pedido(LocalDateTime.now(), StatusPedido.PROCESSANDO, cliente);
		System.out.println("Status do pedido: " + pedido.getStatus());
		System.out.print("Quantos items deseja comprar? ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("-- Dados do item #" + (i+1) + " --");
			sc.nextLine();
			System.out.print("Produto: ");
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do produto: R$");
			Double precoProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			Integer quantidade = sc.nextInt();
			
			pedido.addItem(new PedidoItem(precoProduto, quantidade, new Produto(nomeProduto, precoProduto)));
		}
		
		System.out.println(pedido);
		
		sc.close();

	}

}
