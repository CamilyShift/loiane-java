package exercicios;

import java.util.Scanner;

public class Exerc31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] A = new int[20];
        int[] B = new int[20];
        int posPar = 0, posImpar = 19;

        for (int i = 0; i < A.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[posPar++] = A[i];
            } else {
                B[posImpar--] = A[i];
            }
        }

        System.out.println("Vetor B (pares no início, ímpares no final):");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
