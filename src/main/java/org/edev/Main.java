package org.edev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Execute um dos testes");
        System.out.println("1. Fibonacci \n 2. Faturamento Distribuidora Um \n 3. Faturamento Distribuidora Dois \n 4. Inversão String");

        String action = "";

        while (!action.equals("sair")) {
            try {
                System.out.println("Digite sair para sair.");
                action = ler.nextLine().trim();

                switch (action) {
                    case "1":
                        FibonacciChecker.exe();
                        System.out.println("--------------------------------");
                        System.out.println("1. Fibonacci \n 2. Faturamento Distribuidora Um \n 3. Faturamento Distribuidora Dois \n 4. Inversão String");

                        break;
                    case "2":
                        FaturamentoDistribuidora.exe();
                        System.out.println("--------------------------------");
                        System.out.println("1. Fibonacci \n 2. Faturamento Distribuidora Um \n 3. Faturamento Distribuidora Dois \n 4. Inversão String");

                        break;
                    case "3":
                        FaturamentoDistribuidoraDois.exe();
                        System.out.println("--------------------------------");
                        System.out.println("1. Fibonacci \n 2. Faturamento Distribuidora Um \n 3. Faturamento Distribuidora Dois \n 4. Inversão String");

                        break;
                    case "4":
                        InverterString.exe();
                        System.out.println("--------------------------------");
                        System.out.println("1. Fibonacci \n 2. Faturamento Distribuidora Um \n 3. Faturamento Distribuidora Dois \n 4. Inversão String");

                        break;
                    case "5":
                        SomaSequencia.exe();
                        System.out.println("--------------------------------");
                        System.out.println("1. Fibonacci \n 2. Faturamento Distribuidora Um \n 3. Faturamento Distribuidora Dois \n 4. Inversão String");

                        break;
                    case "sair":
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Você não selecionou algo válido.");
                        break;
                }
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }

        ler.close();
    }
}
