package com.gft.exercicio1;

import java.util.Scanner;

public class Aniversario {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int ano = 2022;

            System.out.println("Data de nascimento 1° pessoa:");
            int pessoaUm = scan.nextInt();

            System.out.println("Data de nascimento 2° pessoa: ");
            int pessoaDois = scan.nextInt();

            int calculoPessoaUm = ano - pessoaUm;
            int calculoPessoaDois = ano - pessoaDois;

            if(pessoaUm > pessoaDois) {
                int diferenca = (pessoaUm - pessoaDois) * 365;
                System.out.println("Pessoa (Um) é mais velha.");
                System.out.println("A diferença é de: " + diferenca + " dias.");

            }else {
                int diferenca = (pessoaUm - pessoaDois) * 365;
                System.out.println("Pessoa (Dois) é mais velha.");
                System.out.println("A diferença é de: " + diferenca + " dias.");
            }
    }

}

