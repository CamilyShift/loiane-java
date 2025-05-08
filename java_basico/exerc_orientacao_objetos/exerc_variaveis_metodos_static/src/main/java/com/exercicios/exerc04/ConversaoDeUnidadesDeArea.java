package com.exercicios.exerc04;

public class ConversaoDeUnidadesDeArea {

    public static double metroQuadradoParaPeQuadrado(double metrosQuadrados) {
        return metrosQuadrados * 10.76;
    }

    public static double peQuadradoParaCentimetroQuadrado(double pesQuadrados) {
        return pesQuadrados * 929;
    }

    public static double milhaQuadradaParaAcre(double milhasQuadradas) {
        return milhasQuadradas * 640;
    }

    public static double acreParaPeQuadrado(double acres) {
        return acres * 43560;
    }

}