package com.exercicios.exerc01;

public class TesteContador {

    public static void main(String[] args) {

        System.out.println("Primeira instância da classe Contador...");
        Contador contador = new Contador();
        System.out.println("Valor inicial do contador: " + Contador.retornarContador());
        System.out.println("Incrementando contador...");
        Contador.incrementar();
        System.out.println("Contador incrementado!!!");
        System.out.println("Novo valor do contador: " + Contador.retornarContador());
        System.out.println("Zerando contador...");
        Contador.zerar();
        System.out.println("Contador zerado!!!");
        System.out.println("Novo valor do contador: " + Contador.retornarContador());
        System.out.println("Incrementando contador...");
        Contador.incrementar();
        System.out.println("Contador incrementado!!!");
        System.out.println("Novo valor do contador: " + Contador.retornarContador());
        System.out.println("Nova instância da classe Contador...");
        Contador contador2 = new Contador();
        System.out.println("Novo valor do contador: " + Contador.retornarContador());

    }
}
