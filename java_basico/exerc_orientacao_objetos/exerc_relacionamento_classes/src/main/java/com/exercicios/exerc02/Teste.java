package com.exercicios.exerc02;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

        Aluno[] alunos = new Aluno[3];
        for (int i = 0; i < 3; i++){
            System.out.print("Insira o nome do aluno " + (i + 1) + ": ");
            String nomeAluno = sc.nextLine();
            System.out.print("Insira a matrícula do aluno " + (i + 1) + ": ");
            String matriculaAluno = sc.nextLine();
            double[] notasAluno = new double[4];
            for (int j = 0; j < 4; j++){
                System.out.print("Nota " + (j + 1) + ": ");
                notasAluno[j] = sc.nextDouble();
            }
            sc.nextLine();
            
            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matriculaAluno);
            aluno.setNotas(notasAluno);
            
            alunos[i] = aluno;
        }

        Professor professor = new Professor();
        professor.setNome("Roberto");
        professor.setDepartamento("Direito 1");
        professor.setEmail("roberto@email.com");

        Curso curso = new Curso();
        curso.setNome("Direito");
        curso.setHorario("20:00");
        curso.setProfessor(professor);
        curso.setAlunos(alunos);

        System.out.println("-------------------------------");
        System.out.println("EXIBINDO INFORMAÇÕES DO CURSO: ");
        System.out.println("-------------------------------");
        System.out.println(curso.exibirInformacoesCurso());
        
    }
}