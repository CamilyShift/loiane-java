package exercicios;

import java.util.Random;

public class Exerc01 {

    public static void main(String[] args) {

        int[][] M = new int[4][4];
        Random random = new Random();

        int maior = -1, linha = -1, coluna = -1;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = random.nextInt(10);
                System.out.print(M[i][j] + " ");

                if (M[i][j] > maior) {
                    maior = M[i][j];
                    linha = i;
                    coluna = j;
                }
            }
            System.out.println();
        }

        System.out.println("\nMaior valor: " + maior);
        System.out.println("Posição: linha " + linha + ", coluna " + coluna);
    }
}