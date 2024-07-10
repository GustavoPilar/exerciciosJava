package application;

import model.entities.Contrato;
import model.entities.Parcela;
import model.services.PayPalServices;
import model.services.ServicoContrato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("-- Entre com os dados do contrato -- ");
            System.out.print("Numero: ");
            int numero = sc.nextInt();
            System.out.print("Data (dd/mm/yyyy): ");
            LocalDate data = LocalDate.parse(sc.next(), fmt);
            System.out.print("Valor do contrato: R$");
            double valor = sc.nextDouble();
            Contrato contrato = new Contrato(numero, data, valor);

            System.out.print("Quantas parcelas? ");
            int parcelas = sc.nextInt();
            ServicoContrato servicoContrato = new ServicoContrato(new PayPalServices());
            servicoContrato.processoContrato(contrato, parcelas);

            System.out.println("Parcelas:");
            for(Parcela parcela : contrato.getParcelas()) {
                System.out.println(parcela);
            }
        }
        catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
