package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {
    public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate data;
    private double valorMensal;

    public Parcela() {

    }

    public Parcela(LocalDate data, double valorMensal) {
        this.data = data;
        this.valorMensal = valorMensal;
    }

    public LocalDate getData() {
        return data;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    @Override
    public String toString() {
        return fmt.format(data) + " - " + String.format("%.2f", getValorMensal());
    }
}
