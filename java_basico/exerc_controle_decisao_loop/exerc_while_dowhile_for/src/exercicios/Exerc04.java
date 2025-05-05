package exercicios;

public class Exerc04 {

    public static void main(String[] args) {

        int populacaoA = 80000;
        int populacaoB = 200000;
        int anos = 0;

        while(populacaoA <= populacaoB) {
            populacaoA += populacaoA * 0.03;
            populacaoB += populacaoB * 0.015;
            anos++;
        }

        System.out.println("São necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a população do país B.");
    }
}