package com.exercicios.exerc01;

public class Contador {

    static int contador;

    public Contador(){
        contador++;
    }

    public static void zerar(){
        contador = 0;
    }

    public static void incrementar(){
        contador++;
    }
    
    public static int retornarContador(){
        return contador;
    }

}