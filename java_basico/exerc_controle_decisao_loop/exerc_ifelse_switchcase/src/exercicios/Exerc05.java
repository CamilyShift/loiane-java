package exercicios;

import java.util.Scanner;

public class Exerc05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Informe a nota 2: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2)/2;
        System.out.println("A média é: " + media);

        if(media == 10){
            System.out.println("Aprovado com distinção.");
        } else if (media >= 7){
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}