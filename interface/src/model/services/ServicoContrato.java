package model.services;

import model.entities.Contrato;
import model.entities.Parcela;

public class ServicoContrato {

    private OnlinePaymentService onlinePaymentService;

    public ServicoContrato() {
    }

    public ServicoContrato(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processoContrato(Contrato contrato, int meses) {
        for (int i = 1; i <= meses; i++) {
            int mes = i;
            double valorParcela = contrato.getValorTotal() / meses;
            double juros = onlinePaymentService.juros(valorParcela, mes);
            double taxa = onlinePaymentService.taxaPagamento(valorParcela + juros);
            double pagamento = juros + taxa + valorParcela;

            contrato.addParcelas(new Parcela(contrato.getData().plusMonths(mes), pagamento));
        }
    }
}
