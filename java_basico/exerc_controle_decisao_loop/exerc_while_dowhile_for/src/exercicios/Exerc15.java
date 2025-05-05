package exercicios;

import java.util.Scanner;

public class Exerc15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de termos da série Fibonacci: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Série de Fibonacci: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}