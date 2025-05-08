package com.exercicios.exerc05;

public class ConversaoDeUnidadesDeVolume {

    public static double litroParaCentimetroCubico(double litro) {
        return litro * 1000;
    }

    public static double metroCubicoParaLitro(double metroCubico) {
        return metroCubico * 1000;
    }

    public static double metroCubicoParaPeCubico(double metroCubico) {
        return metroCubico * 35.32;
    }

    public static double galaoAmericanoParaPolegadaCubica(double galaoAmericano) {
        return galaoAmericano * 231;
    }

    public static double galaoAmericanoParaLitro(double galaoAmericano) {
        return galaoAmericano * 3785;
    }

}