package populacaomundial;

import java.util.Scanner;

public class PopulacaoMundial {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int anoRef = 2020;
        double populacaoAtual = 7.444333222;
        int populacaoEm = 0;
        System.out.println("Informe o ano que deseja saber qual será a população mundial");
        populacaoEm = input.nextInt();

        int diferenca = calculoDiferenca(populacaoEm, anoRef);

        //  populacaoEh = calculoPopulacao(populacaoAtual);
        double populacaoEh = calculoPopulacao(diferenca, populacaoAtual);

        // int populacao = anoAtual - populacaoEm;
        System.out.println("a população mundial daqui" + diferenca + "anos");

        System.out.println("ou seja em: " + populacaoEm + " será de:" + populacaoEh + "");

    }

    public static int calculoDiferenca(int populacaoEm, int anoRef) { // int populacaoEm, int anoRef

        //  int diferenca =
        return populacaoEm - anoRef;
    }

    public static double calculoPopulacao(double diferenca, double populacaoAtual) { // int populacaoEm, int anoRef,  int populacaoAtual

        // double populacaoEh = 0;
        for (int i = 1; i <= diferenca; i++) {
            //System.out.printf("teste\n",teste, i);
            populacaoAtual += populacaoAtual * 0.5 / 100;

            //System.out.printf("Total população %.0f pelo %s anos\n",populacaoAtual,i);
        }

        double populacaoEh = populacaoAtual;
        return populacaoEh;

    }

}
