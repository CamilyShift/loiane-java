package com.exercicios.exerc01;

public class Agenda {

    private String nome;
    private Contato[] contatos;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Contato[] getContatos() {
        return contatos;
    }
    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String exibirInformaçõesAgenda(){
        String informacoes = "Nome da agenda: " + nome + "\n";
        
        if (contatos != null){
            for (Contato c : contatos){
                informacoes += c.exibirInformacoesContato() + "\n";
            }
        }
        
        return informacoes;
    }
}