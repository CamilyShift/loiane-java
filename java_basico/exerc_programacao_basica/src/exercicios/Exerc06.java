package exercicios;

import java.util.Scanner;

public class Exerc06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o raio do círculo: ");
        int raio = sc.nextInt();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);

    }
}