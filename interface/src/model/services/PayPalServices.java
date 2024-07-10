package model.services;

public class PayPalServices implements OnlinePaymentService {

    public static final double TAXA_PAGAMENTO = 0.02;
    public static final double JUROS_MENSAL = 0.01;

    @Override
    public double taxaPagamento(double montante) {
        return montante * TAXA_PAGAMENTO;
    }

    @Override
    public double juros(double montante, int mes) {
        return montante * JUROS_MENSAL * mes;
    }
}
