package com.exercicios.exerc02;

public class TesteContaCorrente {

    public static void main(String[] args) {
     
        ContaCorrente cc = new ContaCorrente("123456", "1843", false, 2000, 567.8);

        System.out.println("Número da conta: " + cc.getNumero());
        System.out.println("Agência: " + cc.getAgencia());
        System.out.println("É especial? " + cc.isEspecial());
        System.out.println("Limite especial: " + cc.getLimiteEspecial());
        System.out.println("Saldo atual: " + cc.getSaldo());

        System.out.println("Saque de 100 reais...");
        if(cc.realizarSaque(100)){
            System.out.println("Saque realizado com sucesso.");
            System.out.println("Novo saldo: " + cc.consultarSaldo());
        }
        else{
            System.out.println("Não foi possível realizar saque. Saldo insuficiente.");
        }

        System.out.println("Depósito de 525 reais...");
        cc.depositarDinheiro(525);
        System.out.println("Depósito realizado com sucesso.");
        System.out.println("Novo saldo: " + cc.consultarSaldo());

        if (cc.verificarChequeEspecial()){
            System.out.println("Está usando cheque especial;"); 
        } else {
            System.out.println("Não está usando cheque especial."); 
        }
    }
}