package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto> produtos = new ArrayList<>();
		System.out.print("Digite a quantidade de produtos: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("\nProduto #" + (i+1) + ":");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: R$");
			Double preco = sc.nextDouble();
			sc.nextLine();
			System.out.print("Comum, importado ou usado (c/i/u)? ");
			char res = sc.next().charAt(0);
			
			Produto p;
			if(res == 'c') { 
				p = new Produto(nome, preco);
				produtos.add(p);
			} else if (res == 'i') {
				System.out.print("Taxa de alfandega: R$");
				double taxa = sc.nextDouble();
				p = new ProdutoImportado(nome, preco, taxa);
				produtos.add(p);
			} else {
				System.out.print("Data de fabricação (dd/mm/yyyy): ");
				LocalDate data = LocalDate.parse(sc.next(), fmt);
				p = new ProdutoUsado(nome, preco, data);
				produtos.add(p);
			}
			
		}
		
		System.out.println();
		for(Produto p : produtos) {
			System.out.println(p.precoEtiqueta());
		}
		
		sc.close();

	}

}
