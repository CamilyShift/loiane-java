package exercicios;

import java.util.Scanner;

public class Exerc23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número N: ");
        int n = sc.nextInt();

        int totalDivisoes = 0;

        for (int i = 2; i <= n; i++) {
            boolean primo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                totalDivisoes++;
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(i + " é primo");
            }
        }

        System.out.println("Total de divisões realizadas: " + totalDivisoes);

    }
}