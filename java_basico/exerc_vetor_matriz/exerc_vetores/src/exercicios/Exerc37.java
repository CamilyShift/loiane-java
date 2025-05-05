package exercicios;

import java.util.Scanner;

public class Exerc37 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] A = new int[15];
        long[] B = new long[15];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            B[i] = fatorial(A[i]);
        }

        System.out.println("Fatoriais:");
        for (int i = 0; i < B.length; i++) {
            System.out.println(A[i] + "! = " + B[i]);
        }
    }

    public static long fatorial(int n) {
        long fat = 1;
        for (int i = 2; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }
}