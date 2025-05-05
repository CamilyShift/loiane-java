package exercicios;

import java.util.Scanner;

public class Exerc18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] idades = new int[10];
        int menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE;
        int posMenor = -1, posMaior = -1;

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Idade " + (i + 1) + ": ");
            idades[i] = sc.nextInt();

            if (idades[i] < menor) {
                menor = idades[i];
                posMenor = i;
            }
            if (idades[i] > maior) {
                maior = idades[i];
                posMaior = i;
            }
        }

        System.out.println("Menor idade: " + menor + " na posição " + posMenor);
        System.out.println("Maior idade: " + maior + " na posição " + posMaior);

    }
}