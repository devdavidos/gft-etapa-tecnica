package com.gft.exercicio3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.println("Digite o nome: ");
        pessoa.setNomePessoa(scan.nextLine());

        System.out.println("Digite a idade: ");
        pessoa.setIdadePessoa(scan.nextInt());

        Cachorro cachorro = new Cachorro();

        System.out.println("Digite a raça do cachorro: ");
        System.out.println("1. Pequeno | 2. Médio | 3. Grande");
        int escolhaRaca = scan.nextInt();

        if (escolhaRaca == 1) {
            cachorro.setRaca("Pequeno");
        } else if(escolhaRaca == 2) {
            cachorro.setRaca("Médio");
        } else if(escolhaRaca == 3) {
            cachorro.setRaca("Grande");
        }


        System.out.println("Digite o porte do cachorro: : ");
        double escolhaPorte = scan.nextDouble();


        System.out.println("Digite a idade do cachorro: ");
        cachorro.setIdade(scan.nextInt());

    }

    public void calcularIdadePessoaAnimal() {
    }
}
