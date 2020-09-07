/**
  2) [Calculadora] Escreva um aplicativo de linha de comando que receba por dois inteiros,
  * e imprima sua soma, produto, diferença e divisão.
  * Exiba o maior dos dois números, seguido pelas palavras “é maior".
  * Se os números forem iguais, imprima a mensagem “Esses números são iguais".

$ java Calculadora 1 2

Soma: 3
Produto: 2
Diferença: -1
Divisão: 0.5
2 é maior
 */
package calculadora;

import java.util.Scanner;

public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("CALCULADORA JAVA");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        double num1 = input.nextDouble();
        
        System.out.println("Informe o segundo numero");
        double num2 = input.nextDouble();
        
       double soma = calculoSoma(num1,num2);
        System.out.println("A soma  ----------------- " +  num1 + " + " + num2 + " = " + soma);
        
        double diferenca = calculoDiferenca(num1,num2);
        System.out.println("A diferença ------------- " +  num1 + " - " + num2 + " = " + diferenca);
        
        double produto = calculoProduto(num1, num2);
        System.out.println("O produto  -------------- " + num1 + " X " + num2 +  " = " + produto);
        
        double divisao = calculoDivisao(num1, num2);
        System.out.println("A divisão --------------- " + num1 + " / " + num2 + " = " + divisao);
        
     
    }
        public static double calculoSoma(double num1, double num2){
              double soma = num1 + num2;
              return soma;
        }
        
        public static double calculoDiferenca(double num1, double num2){
           double diferenca = num1 - num2;
           return diferenca;    
        } 
        
        public static double calculoProduto(double num1, double num2 ){
               double produto = num1 * num2;
                return produto;
        }
        
        public static double calculoDivisao(double num1, double num2){
                double divisao = num1 / num2;
                return divisao;
        }
   }
    
