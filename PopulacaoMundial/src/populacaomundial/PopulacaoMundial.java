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

        double populacaoEh = calculoPopulacao(diferenca, populacaoAtual);

        System.out.println("a população mundial daqui " + diferenca + " anos");

        System.out.println("ou seja em: " + populacaoEm + " será de:" + populacaoEh + "");

    }

    public static int calculoDiferenca(int populacaoEm, int anoRef) {

        return populacaoEm - anoRef;
    }

    public static double calculoPopulacao(double diferenca, double populacaoAtual) {

        for (int i = 1; i <= diferenca; i++) {

            populacaoAtual += populacaoAtual * 1.05 / 100;

        }

        double populacaoEh = populacaoAtual;
        return populacaoEh;

    }

}
