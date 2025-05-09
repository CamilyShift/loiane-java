package com.exercicios.exerc02;

public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String exibirInformacoesAluno(){
        String informacoes = "Nome do aluno: " + nome + "; ";
        informacoes += "Matrícula do aluno: " + matricula + "; ";
        informacoes += "Notas: ";
        
        double soma = 0;
        for (double nota : notas){
            soma += nota;
            informacoes += nota + "  ";
        }

        double media = soma / 4;
        informacoes += "Média: " + media + " -> ";
        if (media >= 7){
            informacoes += "Aprovado!";
        } else {
            informacoes += "Reprovado!";
        }
                
        return informacoes;        
    }
    
    public double calcularMedia(){
        double soma = 0;

        for (double nota : notas){
            soma += nota;
        }

        return soma / 4;
    }
}