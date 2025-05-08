package com.exercicios.exerc04;

public class TesteConversaoDeUnidadesDeArea {

    public static void main(String[] args) {
     
        System.out.println("10 metros quadrados para pés quadrados = " + ConversaoDeUnidadesDeArea.metroQuadradoParaPeQuadrado(10));
        System.out.println("10 pés quadrados para centímetros quadrados = " + ConversaoDeUnidadesDeArea.peQuadradoParaCentimetroQuadrado(10));
        System.out.println("10 milhas quadradas para acres = " + ConversaoDeUnidadesDeArea.milhaQuadradaParaAcre(10));
        System.out.println("10 acres para pés quadrados = " + ConversaoDeUnidadesDeArea.acreParaPeQuadrado(10));

    }
}
