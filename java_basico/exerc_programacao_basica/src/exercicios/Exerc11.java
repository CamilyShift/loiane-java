package exercicios;

import java.util.Scanner;

public class Exerc11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int n1 = sc.nextInt();
        System.out.print("Informe outro número inteiro: ");
        int n2 = sc.nextInt();
        System.out.print("Agora informe um número real: ");
        double n3 = sc.nextDouble();

        double produto = (n1 * 2) * (n2/2);
        double soma = (n1 * 3) + n3;
        double elevado = Math.pow(n3, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo: " + produto);
        System.out.println("A soma do triplo do primeiro com o terceiro: " + soma);
        System.out.println("O terceiro elevado ao cubo: " + elevado);
    }
}