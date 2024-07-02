package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
	
	public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String nome;
	private String email;
	private LocalDate nascimento;
	
	public Cliente(String nome, String email, LocalDate nascimento) {
		this.nome = nome;
		this.email = email;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return nome + " - (" + fmt.format(nascimento) + ") - " + email;
	}
	
	
	
}
