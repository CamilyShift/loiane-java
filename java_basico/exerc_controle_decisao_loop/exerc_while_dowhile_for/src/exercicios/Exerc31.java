package exercicios;

import java.util.Scanner;

public class Exerc31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Lojas Tabajara");
            double total = 0;
            int contador = 1;

            while (true) {
                System.out.print("Produto " + contador + ": R$ ");
                double preco = sc.nextDouble();
                if (preco == 0) {
                    break;
                }
                total += preco;
                contador++;
            }

            System.out.println("Total: R$ " + total);
            System.out.print("Dinheiro: R$ ");
            double dinheiro = sc.nextDouble();
            System.out.println("Troco: R$ " + (dinheiro - total));
            System.out.println();
        }
    }
}