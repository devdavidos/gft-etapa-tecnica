package com.gft.exercicio4;

import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero ");
        int numero = scan.nextInt();
        for (int i = 1; i <= 100; i++) {
            int counter = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) ++counter;
            }
            if (counter == numero) {
                System.out.println("The number: " + i + " is prime");
            }
        }
    }
}

