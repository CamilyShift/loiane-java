package exercicios;

import java.util.Scanner;

public class Exerc25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas na turma? ");
        int n = sc.nextInt();

        int somaIdades = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Idade da pessoa " + i + ": ");
            somaIdades += sc.nextInt();
        }

        double media = (double) somaIdades / n;

        if (media <= 25) {
            System.out.println("Turma jovem");
        } else if (media <= 60) {
            System.out.println("Turma adulta");
        } else {
            System.out.println("Turma idosa");
        }
    }
}