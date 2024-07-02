package entities;

import java.time.LocalDate;

public class ContratoHora {
	
	private LocalDate data;
	private Double valorPorHora;
	private Integer hora;

	public ContratoHora(LocalDate data, Double valorPorHora, Integer hora) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.hora = hora;
	}

	// Getters e Setters
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}
	
	// Metodos
	public Double valorTotal() {
		return hora * valorPorHora;
	}
	
}
