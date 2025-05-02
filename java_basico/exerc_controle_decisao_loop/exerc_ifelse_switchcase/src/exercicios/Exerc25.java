package exercicios;

import java.util.Scanner;

public class Exerc25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int respostas = 0;

        System.out.print("Telefonou para a vítima? (s/n): ");
        if (sc.next().equalsIgnoreCase("s")) {
            respostas++;
        }

        System.out.print("Esteve no local do crime? (s/n): ");
        if (sc.next().equalsIgnoreCase("s")) {
            respostas++;
        }

        System.out.print("Mora perto da vítima? (s/n): ");
        if (sc.next().equalsIgnoreCase("s")) {
            respostas++;
        }

        System.out.print("Devia para a vítima? (s/n): ");
        if (sc.next().equalsIgnoreCase("s")) {
            respostas++;
        }

        System.out.print("Já trabalhou com a vítima? (s/n): ");
        if (sc.next().equalsIgnoreCase("s")) {
            respostas++;
        }

        if (respostas == 2) {
            System.out.println("Suspeita");
        } else if (respostas == 3 || respostas == 4) {
            System.out.println("Cúmplice");
        } else if (respostas == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}