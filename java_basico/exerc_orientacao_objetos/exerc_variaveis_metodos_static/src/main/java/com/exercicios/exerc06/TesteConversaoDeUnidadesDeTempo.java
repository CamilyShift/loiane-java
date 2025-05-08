package com.exercicios.exerc06;

public class TesteConversaoDeUnidadesDeTempo {

    public static void main(String[] args) {
     
        System.out.println("10 minutos para segundos = " + ConversaoDeUnidadesDeTempo.minutoParaSegundo(10));
        System.out.println("10 horas para minutos = " + ConversaoDeUnidadesDeTempo.horaParaMinuto(10));
        System.out.println("10 dias para horas = " + ConversaoDeUnidadesDeTempo.diaParaHora(10));
        System.out.println("10 semanas para dias = " + ConversaoDeUnidadesDeTempo.semanaParaDia(10));
        System.out.println("10 meses para dias = " + ConversaoDeUnidadesDeTempo.mesParaDia(10));
        System.out.println("10 anos para dias = " + ConversaoDeUnidadesDeTempo.anoParaDia(10));

    }
}