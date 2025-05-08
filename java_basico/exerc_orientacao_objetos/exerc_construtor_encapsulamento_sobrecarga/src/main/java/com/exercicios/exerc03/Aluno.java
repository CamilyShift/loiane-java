package com.exercicios.exerc03;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas = new String[3];
    private double[][] notasDisciplinas = new double[3][3];
    
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
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String[] getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }
    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }
    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    public Aluno(String nome, String matricula, String curso, String[] disciplinas, double[][] notasDisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.notasDisciplinas = notasDisciplinas;
    }

    public Aluno() { }

    public void mostrarInformacoes(){

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

    public boolean verificarAprovacao(int idx){

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

    public void setDisciplinas(int i, String nextLine) {
        this.disciplinas[i] = nextLine;
    }

    public void setNotasDisciplinas(int i, int j, double nextDouble) {
        this.notasDisciplinas[i][j] = nextDouble;
    }
}