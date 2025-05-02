package exercicios;

import java.util.Scanner;

public class Exerc16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de a: ");
        double a = sc.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau");
        } else {
            System.out.print("Valor de b: ");
            double b = sc.nextDouble();
            System.out.print("Valor de c: ");
            double c = sc.nextDouble();

            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Raiz única: " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Raízes: " + x1 + " e " + x2);
            }
        }
    }
}