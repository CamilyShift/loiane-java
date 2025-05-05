package exercicios;

import java.util.Scanner;

public class Exerc12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número que deseja ver a tabuada: ");
        int num = sc.nextInt();

        System.out.println("Tabuada do " + num + ": ");
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}