package com.exercicios.exerc01;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        Contato[] contatos = new Contato[3];

        System.out.print("Insira o nome da agenda: ");
        agenda.setNome(sc.nextLine());

        for(int i = 0; i < 3; i++){
            System.out.println("Insira os dados do contato " + (i + 1) + ": ");
            Contato contato = new Contato();

            System.out.print("Nome: ");
            contato.setNome(sc.nextLine());
            System.out.print("E-mail: ");
            contato.setEmail(sc.nextLine());
            System.out.print("Telefone: ");
            contato.setTelefone(sc.nextLine());

            contatos[i] = contato;
        }

        agenda.setContatos(contatos);

        System.out.println("--------------------------------");
        System.out.println("EXIBINDO INFORMAÇÕES DA AGENDA: ");
        System.out.println("--------------------------------");
        if (agenda != null){
            System.out.println(agenda.exibirInformaçõesAgenda());
        }

    }
}
