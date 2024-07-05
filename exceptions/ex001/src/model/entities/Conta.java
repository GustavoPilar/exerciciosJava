package model.entities;

import model.exceptions.DomainException;

public class Conta {

	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {
		
	}

	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) throws DomainException {
		if(saldo < 0.0 || limiteSaque < 0.0) {
			throw new DomainException("O valor informado não pode ser negativo.");
		}
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	// METODOS
	public void deposito(Double montante) {
		saldo += montante;
	}
	
	public void saque(Double montante) throws DomainException {
		if(saldo <= 0.0) {
			throw new DomainException("Erro de saque: A conta está zerada ou negativada.");
		}
		if(montante <= limiteSaque && saldo < montante) {
			throw new DomainException("Erro de saque: O valor para saque execede o saldo atual");
		}
		if (montante > limiteSaque) {
			throw new DomainException("Erro de saque: O valor para saque execede o limite permitido de R$"
					+ String.format("%.2f", limiteSaque));
		}
		saldo -= montante;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Numero da conta: " + getNumero());
		sb.append("\nTitular: " + getTitular());
		sb.append("\nSaldo: R$" + String.format("%.2f", getSaldo()));
		return sb.toString();
	}
	
	
}
