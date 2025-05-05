package exercicios;

import java.util.Scanner;

public class Exerc04 {

    public static void main(String[] args) {

        String[][] agenda = new String[30][24];
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar compromisso");
            System.out.println("2 - Consultar compromisso");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();

            if (opcao == 0) {
                break;
            }

            System.out.print("Dia (1-31): ");
            int dia = sc.nextInt();
            System.out.print("Hora (0-23): ");
            int hora = sc.nextInt();

            if (dia < 1 || dia > 31 || hora < 0 || hora > 23) {
                System.out.println("Dia ou hora inválidos!");
                continue;
            }

            if (opcao == 1) {
                sc.nextLine();
                System.out.print("Digite o compromisso: ");
                String compromisso = sc.nextLine();
                agenda[dia - 1][hora] = compromisso;
                System.out.println("Compromisso adicionado!");
            } else if (opcao == 2) {
                String compromisso = agenda[dia - 1][hora];
                if (compromisso != null) {
                    System.out.println("Compromisso: " + compromisso);
                } else {
                    System.out.println("Nenhum compromisso agendado.");
                }
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}