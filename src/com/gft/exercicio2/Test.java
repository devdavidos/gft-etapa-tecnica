package com.gft.exercicio2;

public class Test {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.setLado(30);

        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(30);
        triangulo.setBase(20);

        Retangulo retangulo = new Retangulo();
        retangulo.setBase(20);
        retangulo.setAltura(10);

        Trapezio trapezio = new Trapezio();
        trapezio.setBaseMaior(20);
        trapezio.setBaseMenor(10);
        trapezio.setAltura(10);

        triangulo.calculoDeArea();
        quadrado.calculoDeArea();
        retangulo.calculoDeArea();
        trapezio.calculoDeArea();
    }
}
