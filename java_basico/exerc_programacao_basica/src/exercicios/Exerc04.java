package exercicios;

import java.util.Scanner;

public class Exerc04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a nota 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Digite a nota 3: ");
        double n3 = sc.nextDouble();
        System.out.print("Digite a nota 4: ");
        double n4 = sc.nextDouble();

        double media = (n1 + n2 + n3 + n4)/4;
        System.out.println("A média final é: " + media);

    }
}