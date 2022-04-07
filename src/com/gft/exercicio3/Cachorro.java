package com.gft.exercicio3;

public class Cachorro extends Pessoa {

    private String raca;
    private double porte;
    private int idade;

    public Cachorro() {
    }


    public Cachorro(String nomePessoa, int idadePessoa, String pet, String raca, double porte, int idade) {
        super(nomePessoa, idadePessoa, pet);
        this.raca = raca;
        this.porte = porte;
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPorte() {
        return porte;
    }

    public void setPorte(double porte) {
        this.porte = porte;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
