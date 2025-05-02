package exercicios;

import java.util.Scanner;

public class Exerc15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Lado A: ");
        int a = sc.nextInt();
        System.out.print("Lado B: ");
        int b = sc.nextInt();
        System.out.print("Lado C: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
    }
}