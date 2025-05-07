package org.exercicios.exerc03;

public class Aluno {

    String nome;
    String matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][3];

    void mostrarInformacoes(){

        System.out.println("Nome: " +  nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        for (int i = 0; i < notasDisciplinas.length; i++){
            System.out.println("Notas da disciplina " + disciplinas[i] + ": ");
            for (int j = 0; j < notasDisciplinas[i].length; j++){
                System.out.print(notasDisciplinas[i][j] + "  ");
            }
            System.out.println();
        }
    }

    boolean verificarAprovacao(int idx){

        double somaNotas = 0;
        for (int i = 0; i < notasDisciplinas[idx].length; i++){
            somaNotas += notasDisciplinas[idx][i];
        }
        double mediaNotas = somaNotas/3;

        if(mediaNotas >= 7){
            return true;
        }
        return false;
    }
}