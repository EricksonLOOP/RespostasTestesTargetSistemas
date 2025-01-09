package org.edev;

import java.util.Scanner;

public class FibonacciChecker {

    public static boolean isFibonacci(int number) {
        if (number == 0 || number == 1) {
            return true;
        }

        int prev = 0;
        int current = 1;
        int next = prev + current;

        while (next <= number) {
            if (next == number) {
                return true;
            }
            prev = current;
            current = next;
            next = prev + current;
        }

        return false;
    }

    public static void exe() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " NÃO pertence à sequência de Fibonacci.");
        }

    }
}
