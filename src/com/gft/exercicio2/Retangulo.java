package com.gft.exercicio2;

public class Retangulo implements CalculoGerais{

    private double area;
    private double base;
    private double altura;

    public Retangulo() {
    }

    public Retangulo(double area, double base, double altura) {
        this.area = area;
        this.base = base;
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calculoDeArea() {
        this.area = this.base * this.altura;
        System.out.println("A área do retángulo é: " + this.area + "m².");
    }
}
