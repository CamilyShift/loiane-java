package exercicios;

import java.util.Random;

public class Exerc02 {

    public static void main(String[] args) {

        int[][] M = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = random.nextInt(10);
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }

        int linha = 5;
        int maiorLinha = Integer.MIN_VALUE;
        int menorLinha = Integer.MAX_VALUE;

        for (int j = 0; j < M.length; j++) {
            int valor = M[linha][j];
            if (valor > maiorLinha) {
                maiorLinha = valor;
            }
            if (valor < menorLinha) {
                menorLinha = valor;
            }
        }

        int coluna = 7;
        int maiorColuna = Integer.MIN_VALUE;
        int menorColuna = Integer.MAX_VALUE;

        for (int i = 0; i < M.length; i++) {
            int valor = M[i][coluna];
            if (valor > maiorColuna) {
                maiorColuna = valor;
            }
            if (valor < menorColuna) {
                menorColuna = valor;
            }
        }

        System.out.println("\nLinha 5 - Maior: " + maiorLinha + ", Menor: " + menorLinha);
        System.out.println("Coluna 7 - Maior: " + maiorColuna + ", Menor: " + menorColuna);
    }
}