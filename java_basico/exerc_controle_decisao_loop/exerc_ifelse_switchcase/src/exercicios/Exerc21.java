package exercicios;

import java.util.Scanner;

public class Exerc21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do saque (10 a 600): ");
        int valor = sc.nextInt();

        if (valor < 10 || valor > 600) {
            System.out.println("Valor inválido.");
        } else {
            int nota100 = valor / 100;
            int resto = valor % 100;

            int nota50 = resto / 50;
            resto = resto % 50;

            int nota10 = resto / 10;
            resto = resto % 10;

            int nota5 = resto / 5;
            int nota1 = resto % 5;

            System.out.println("Notas de 100: " + nota100);
            System.out.println("Notas de 50: " + nota50);
            System.out.println("Notas de 10: " + nota10);
            System.out.println("Notas de 5: " + nota5);
            System.out.println("Notas de 1: " + nota1);
        }
    }
}