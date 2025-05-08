package com.exercicios.exerc03;

import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(sc.nextLine());
        System.out.print("Digite a matrícula: ");
        aluno.setMatricula(sc.nextLine());
        System.out.print("Digite o curso: ");
        aluno.setCurso(sc.nextLine());
        for(int i = 0; i < aluno.getDisciplinas().length; i++){
            System.out.print("Digite o nome da disciplina " + (i + 1) + ": ");
            aluno.setDisciplinas(i, sc.nextLine());
        }
        for(int i = 0; i < aluno.getNotasDisciplinas().length; i++){
            System.out.println("Notas da disciplina " + aluno.getDisciplinas()[i] + ": ");
            for(int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++){
                System.out.print("Nota " + (j + 1) + ": ");
                aluno.setNotasDisciplinas(i, j, sc.nextDouble());
            }
        }

        System.out.println("-----------------------------");
        System.out.println("EXIBINDO INFORMAÇÕES DO ALUNO");
        System.out.println("-----------------------------");
        aluno.mostrarInformacoes();
        
        for(int i = 0; i < aluno.getDisciplinas().length; i++){
            if(aluno.verificarAprovacao(i)){
                System.out.println("Aprovado na disciplina " + aluno.getDisciplinas()[i] + "!");
            }
            else{
                System.out.println("Reprovado na disciplina " + aluno.getDisciplinas()[i] + "!");
            }
        }
    }
}