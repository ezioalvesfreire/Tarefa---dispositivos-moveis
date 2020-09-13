package programaretangulo;

import java.util.Scanner;

public class ProgramaRetangulo {

    public static void main(String[] args) {
        // TODO code application logic here

        float perimetro = 0;
        float area = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o comprimento");
        float comprimento = input.nextFloat();

        System.out.println("informe a largura");
        float largura = input.nextFloat();

        Retangulo r1 = new Retangulo(comprimento, largura);
        r1.imprime();

    }

}
