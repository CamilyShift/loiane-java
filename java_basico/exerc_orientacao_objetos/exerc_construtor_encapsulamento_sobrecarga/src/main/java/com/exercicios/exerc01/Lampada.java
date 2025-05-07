package com.exercicios.exerc01;

public class Lampada {

    private String modelo;
    private int potencia;
    private String cor;
    private boolean ligada;
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public boolean isLigada() {
        return ligada;
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public Lampada(String modelo, int potencia, String cor, boolean ligada) {
        this.modelo = modelo;
        this.potencia = potencia;
        this.cor = cor;
        this.ligada = ligada;
    }

    public void ligarLampada(){
        setLigada(true);
    }

    public void apagarLampada(){
        setLigada(false);
    }

    public void estadoLampada(){
        if(isLigada()){
            System.out.println("A lâmpada está acesa.");
        }
        else{
            System.out.println("A lâmpada está apagada.");
        }
    }

    public void alterarEstadoLampada(){
        if(isLigada()){
            apagarLampada();
        }
        else{
            ligarLampada();
        }
    }
}