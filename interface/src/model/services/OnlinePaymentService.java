package model.services;

public interface OnlinePaymentService {
    double taxaPagamento(double montante);
    double juros(double montante, int mes);
}
