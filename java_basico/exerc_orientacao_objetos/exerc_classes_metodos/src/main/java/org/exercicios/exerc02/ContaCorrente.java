package org.exercicios.exerc02;

public class ContaCorrente {

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double saldo;

    boolean realizarSaque(double qtdSacar){

        if (qtdSacar <= saldo) {
            saldo -= qtdSacar;
            return true;
        } else if (especial && (saldo + limiteEspecial) >= qtdSacar) {
            saldo -= qtdSacar;
            return true;
        } else {
            return false;
        }

    }

    void depositarDinheiro(double qtdDeposito){
        saldo += qtdDeposito;
    }

    double consultarSaldo(){
        return saldo;
    }

    boolean verificarChequeEspecial(){
        return saldo < 0;
    }

}