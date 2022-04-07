package com.gft.exercicio2;

public class Trapezio implements CalculoGerais{

    private double area;
    private double baseMaior;
    private double baseMenor;
    private double altura;

    public Trapezio() {
    }

    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calculoDeArea() {
        this.area = ((this.baseMaior + this.baseMenor) * this.altura) / 2;
        System.out.println("A área do trapézio é de: " + area + "m².");
    }
}
