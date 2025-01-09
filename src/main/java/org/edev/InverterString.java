package org.edev;

import java.util.Scanner;

public class InverterString {

    public static void exe() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a string que deseja inverter: ");
        String input = scanner.nextLine();


        String resultado = inverterString(input);


        System.out.println("String invertida: " + resultado);

    }

    public static String inverterString(String str) {

        StringBuilder invertida = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            invertida.append(str.charAt(i));
        }

        return invertida.toString();
    }
}

