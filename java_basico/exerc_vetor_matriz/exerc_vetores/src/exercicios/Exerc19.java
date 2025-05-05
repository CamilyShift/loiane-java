package exercicios;

import java.util.Scanner;

public class Exerc19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] result = new double[10];
        String situacao;

        for (int i = 0; i < 10; i++) {
            System.out.print("Nota 1 do aluno " + (i + 1) + ": ");
            nota1[i] = sc.nextDouble();
            System.out.print("Nota 2 do aluno " + (i + 1) + ": ");
            nota2[i] = sc.nextDouble();

            result[i] = (nota1[i] + nota2[i]) / 2;
        }

        for (int i = 0; i < 10; i++) {
            if(result[i] >= 7){
                situacao = "Aprovado";
            }
            else {
                situacao = "Reprovado";
            }

            System.out.printf("Aluno %d - Média: %.2f - %s%n", (i + 1), result[i], situacao);
        }

    }
}