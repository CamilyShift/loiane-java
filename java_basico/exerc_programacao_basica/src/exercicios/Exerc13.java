package exercicios;

import java.util.Scanner;

public class Exerc13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a altura (m): ");
        double altura = sc.nextDouble();
        System.out.print("Informe o peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Informe o sexo (M ou F): ");
        String sexo = sc.next();

        double pesoIdeal = 0;

        if(sexo.equals("M")){
            pesoIdeal = (72.7 * altura) - 58;
        }
        else if(sexo.equals("F")){
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        else{
            System.out.println("Sexo inválido.");
        }

        System.out.println("O peso ideal é: " + pesoIdeal);

        if(peso < pesoIdeal){
            System.out.println("Você está abaixo do peso ideal.");
        }
        else if(peso > pesoIdeal){
            System.out.println("Você está acima do peso ideal.");
        }
        else {
            System.out.println("Você está no peso ideal.");
        }

    }
}