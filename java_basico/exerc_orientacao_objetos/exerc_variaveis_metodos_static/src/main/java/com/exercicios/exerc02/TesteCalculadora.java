package com.exercicios.exerc02;

public class TesteCalculadora {

    public static void main(String[] args) {
     
        System.out.println("2 + 3 = " + Calculadora.somar(2, 3));
        System.out.println("51 - 44 = " + Calculadora.subtrair(51, 44));
        System.out.println("5 * 19 = " + Calculadora.multiplicar(5, 19));
        System.out.println("66 / 3 = " + Calculadora.dividir(66, 3));
        System.out.println("2^6 = " + Calculadora.potencia(2.0, 6.0));
    }
}
