package exercicios;

import java.util.Scanner;

public class Exerc11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Salário atual: R$ ");
        double salario = sc.nextDouble();

        double percentual = 0;

        if (salario <= 280) {
            percentual = 0.20;
        } else if (salario > 280 && salario < 700) {
            percentual = 0.15;
        } else if (salario >= 700 && salario < 1500) {
            percentual = 0.10;
        } else {
            percentual = 0.05;
        }

        double aumento = salario * percentual;
        double novoSalario = salario + aumento;

        System.out.println("Salário inicial: R$ " + salario);
        System.out.println("Percentual: " + (percentual * 100) + "%");
        System.out.println("Aumento: R$ " + aumento);
        System.out.println("Novo salário: R$ " + novoSalario);


    }
}