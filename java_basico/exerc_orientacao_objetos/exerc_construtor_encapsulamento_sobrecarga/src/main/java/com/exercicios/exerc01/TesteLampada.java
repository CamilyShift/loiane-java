package com.exercicios.exerc01;

public class TesteLampada {

    public static void main(String[] args) {
    
        Lampada lampada = new Lampada("ABC", 110, "Branca", true);

        System.out.println("Modelo: " + lampada.getModelo());
        System.out.println("Potência: " + lampada.getPotencia());
        System.out.println("Cor: " + lampada.getCor());
        System.out.println("Está ligada? " + lampada.isLigada());

        lampada.estadoLampada();
        lampada.alterarEstadoLampada();
        lampada.estadoLampada();
        lampada.ligarLampada();
        lampada.estadoLampada();
    }
}