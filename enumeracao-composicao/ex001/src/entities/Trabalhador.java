package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.CargoNivel;

public class Trabalhador {
	
	private String nome;
	private CargoNivel nivel;
	private Double salarioBase;
	
	private List<ContratoHora> contratos = new ArrayList<>();;
	private Departamento departamento;
	
	public Trabalhador(String nome, CargoNivel nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CargoNivel getNivel() {
		return nivel;
	}

	public void setNivel(CargoNivel nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	// Metodos

	public void addContrato(ContratoHora contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(ContratoHora contrato) {
		contratos.remove(contrato);
	}
	
	public Double renda(Integer mes, Integer ano) {
		Double valor = salarioBase;
		for(ContratoHora c : contratos) {
			if(c.getData().getYear() == ano && c.getData().getMonthValue() == mes) {
				valor += c.valorTotal();
			}
		}
		
		return valor;
	}

	@Override
	public String toString() {
		return "Trabalhador [nome= " + nome + ", nivel= " + nivel + ", salarioBase= " + salarioBase + ", departamento= " + departamento + "]";
	}

	
	
	
	
}
