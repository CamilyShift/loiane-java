package exercicios;

import java.util.Scanner;

public class Exerc10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int num2 = sc.nextInt();

        for (int i = Math.min(num1, num2) + 1; i < Math.max(num1, num2); i++) {
            System.out.println(i);
        }
    }
}