package com.gft.exercicio2;

public class Quadrado implements CalculoGerais{

    private double area;
    private double lado;

    public Quadrado() {
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calculoDeArea() {
        this.area = this.lado * this.lado;
        System.out.println("A área do quadrado é: " + this.area + "m².");
    }
}
