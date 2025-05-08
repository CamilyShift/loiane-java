package com.exercicios.exerc05;

public class TesteConversaoDeUnidadesDeVolume {

    public static void main(String[] args) {
        
        System.out.println("10 litros para centímetros cúbicos = " + ConversaoDeUnidadesDeVolume.litroParaCentimetroCubico(10));
        System.out.println("10 metros cúbicos para litros = " + ConversaoDeUnidadesDeVolume.metroCubicoParaLitro(10));
        System.out.println("10 metros cúbicos para pés cubicos = " + ConversaoDeUnidadesDeVolume.metroCubicoParaPeCubico(10));
        System.out.println("10 galões americanos para polegadas cúbicas = " + ConversaoDeUnidadesDeVolume.galaoAmericanoParaPolegadaCubica(10));
        System.out.println("10 galões americanos para litros = " + ConversaoDeUnidadesDeVolume.galaoAmericanoParaLitro(10));

    }
}