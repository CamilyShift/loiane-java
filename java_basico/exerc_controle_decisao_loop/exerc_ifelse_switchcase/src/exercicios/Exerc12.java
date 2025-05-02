package exercicios;

import java.util.Scanner;

public class Exerc12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da hora: R$ ");
        double valorHora = sc.nextDouble();
        System.out.print("Horas no mês: ");
        double horas = sc.nextDouble();

        double salarioBruto = valorHora * horas;
        double ir = 0;

        if (salarioBruto <= 900) {
            ir = 0;
        } else if (salarioBruto <= 1500) {
            ir = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            ir = salarioBruto * 0.10;
        } else {
            ir = salarioBruto * 0.20;
        }

        double inss = salarioBruto * 0.10;
        double fgts = salarioBruto * 0.11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("(-) IR: R$ " + ir);
        System.out.println("(-) INSS: R$ " + inss);
        System.out.println("FGTS: R$ " + fgts);
        System.out.println("Total descontos: R$ " + totalDescontos);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

    }
}