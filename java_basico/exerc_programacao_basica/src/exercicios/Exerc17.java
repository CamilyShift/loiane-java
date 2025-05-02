package exercicios;

import java.util.Scanner;

public class Exerc17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho da área a ser pintada (metros quadrados): ");
        double area = sc.nextDouble();

        double areaComFolga = area * 1.1;
        double litrosNecessarios = areaComFolga / 6;

        int latas = (int)Math.ceil(litrosNecessarios / 18);
        double precoLatas = latas * 80;

        int galoes = (int)Math.ceil(litrosNecessarios / 3.6);
        double precoGaloes = galoes * 25;

        int latasMistura = (int)(litrosNecessarios / 18);
        double resto = litrosNecessarios - (latasMistura * 18);
        int galoesMistura = (int)Math.ceil(resto / 3.6);
        double precoMistura = (latasMistura * 80) + (galoesMistura * 25);

        System.out.println("\nOpção 1: Apenas latas de 18 litros");
        System.out.printf("Quantidade: %d lata(s) - Preço: R$ %.2f%n", latas, precoLatas);
        System.out.println("\nOpção 2: Apenas galões de 3,6 litros");
        System.out.printf("Quantidade: %d galão(ões) - Preço: R$ %.2f%n", galoes, precoGaloes);
        System.out.println("\nOpção 3: Mistura");
        System.out.printf("Quantidade: %d lata(s) e %d galão(ões) - Preço: R$ %.2f%n", latasMistura, galoesMistura, precoMistura);
    }
}