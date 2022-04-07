package com.gft.exercicio2;

public class Triangulo implements CalculoGerais{
    private double area;
    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
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
        this.area = (this.base * this.altura) / 2;
        System.out.println("A área do triangulo é: " + this.area + "m².");
    }
}
