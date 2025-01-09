package org.edev;

import java.util.Scanner;

public class FaturamentoDistribuidora {

    public static void exe() {
        Scanner scanner = new Scanner(System.in);


        double[] faturamentoDiario = new double[30];

        System.out.println("Digite o faturamento diário para 30 dias:");
        for (int i = 0; i < faturamentoDiario.length; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            faturamentoDiario[i] = scanner.nextDouble();
        }

        double menorFaturamento = calcularMenorFaturamento(faturamentoDiario);
        double maiorFaturamento = calcularMaiorFaturamento(faturamentoDiario);
        double mediaMensal = calcularMediaMensal(faturamentoDiario);
        int diasAcimaDaMedia = contarDiasAcimaDaMedia(faturamentoDiario, mediaMensal);

        System.out.println("\nMenor valor de faturamento em um dia do mês: " + menorFaturamento);
        System.out.println("Maior valor de faturamento em um dia do mês: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia);

    }

    public static double calcularMenorFaturamento(double[] faturamento) {
        double menor = Double.MAX_VALUE;
        for (double valor : faturamento) {
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }

    public static double calcularMaiorFaturamento(double[] faturamento) {
        double maior = Double.MIN_VALUE;
        for (double valor : faturamento) {
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }

    public static double calcularMediaMensal(double[] faturamento) {
        double soma = 0;
        int diasComFaturamento = 0;
        for (double valor : faturamento) {
            if (valor > 0) {
                soma += valor;
                diasComFaturamento++;
            }
        }
        return soma / diasComFaturamento;
    }

    public static int contarDiasAcimaDaMedia(double[] faturamento, double mediaMensal) {
        int diasAcimaDaMedia = 0;
        for (double valor : faturamento) {
            if (valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }
        return diasAcimaDaMedia;
    }
}
