package org.exercicios.exerc03;

import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.print("Digite a matrícula: ");
        aluno.matricula = sc.nextLine();
        System.out.print("Digite o curso: ");
        aluno.curso = sc.nextLine();
        for(int i = 0; i < aluno.disciplinas.length; i++){
            System.out.print("Digite o nome da disciplina " + (i + 1) + ": ");
            aluno.disciplinas[i] = sc.nextLine();
        }
        for(int i = 0; i < aluno.notasDisciplinas.length; i++){
            System.out.println("Notas da disciplina " + aluno.disciplinas[i] + ": ");
            for(int j = 0; j < aluno.notasDisciplinas.length; j++){
                System.out.print("Nota " + (j + 1) + ": ");
                aluno.notasDisciplinas[i][j] = sc.nextDouble();
            }
        }

        System.out.println("-----------------------------");
        System.out.println("EXIBINDO INFORMAÇÕES DO ALUNO");
        System.out.println("-----------------------------");
        aluno.mostrarInformacoes();
        
        for(int i = 0; i < aluno.disciplinas.length; i++){
            if(aluno.verificarAprovacao(i)){
                System.out.println("Aprovado na disciplina " + aluno.disciplinas[i] + "!");
            }
            else{
                System.out.println("Reprovado na disciplina " + aluno.disciplinas[i] + "!");
            }
        }

    }
}
