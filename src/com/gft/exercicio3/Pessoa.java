package com.gft.exercicio3;

public class Pessoa {

    private String nomePessoa;
    private int idadePessoa;
    private String pet;

    public Pessoa() {
    }

    public Pessoa(String nomePessoa, int idadePessoa, String pet) {
        this.nomePessoa = nomePessoa;
        this.idadePessoa = idadePessoa;
        this.pet = pet;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "--- Pessoa ---" +
                "\nNome: " + nomePessoa + '\'' +
                "\nIdade: " + idadePessoa + " anos." +
                "\nPet: " + pet;

    }
}
