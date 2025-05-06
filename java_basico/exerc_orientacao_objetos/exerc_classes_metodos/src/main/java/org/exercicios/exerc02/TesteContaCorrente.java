package org.exercicios.exerc02;

public class TesteContaCorrente {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.numero = "123456";
        cc.agencia = "1234";
        cc.especial = true;
        cc.limiteEspecial = 500;
        cc.saldo = -10;

        System.out.println("Saldo da conta " + cc.numero + " = " + cc.saldo);

        boolean saque = cc.realizarSaque(10);

        if (saque){
            System.out.println("Saque realizado com sucesso");
            System.out.println("Saldo atual: " + cc.consultarSaldo());
        } else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente");
        }

        cc.depositarDinheiro(500);
        System.out.println("Depósito realizado com sucesso");
        System.out.println("Saldo atual: " + cc.consultarSaldo());

        if (cc.verificarChequeEspecial()){
            System.out.println("Está usando cheque especial"); 
        } else {
            System.out.println("Não está usando cheque especial"); 
        }

    }
}
