package exercicios;

import java.util.Scanner;

public class Exerc24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        boolean palindromo = true;

        for (int i = 0; i < A.length; i++) {
            System.out.print("Elemento " + i + ": ");
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < A.length / 2; i++) {
            if (A[i] != A[A.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }

        if(palindromo){
            System.out.println("O vetor é um palíndromo.");
        }
        else{
            System.out.println("O vetor não é um palíndromo.");
        }
    }
}