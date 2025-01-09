package org.edev;

public class SomaSequencia {

    public static void exe() {
        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

       System.out.println("A soma da primeira questão no desafio é: "+SOMA);
    }
}
