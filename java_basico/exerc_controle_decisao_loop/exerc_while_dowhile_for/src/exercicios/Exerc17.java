package exercicios;

import java.util.Scanner;

public class Exerc17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int n = sc.nextInt();
        long fatorial = 1;

        for (int i = n; i > 1; i--) {
            fatorial *= i;
        }

        System.out.println(n + "! = " + fatorial);
    }
}