package lojaeletronicos;

import java.util.ArrayList;
import java.util.Scanner;

public class LojaEletronicos {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        Fatura[] arrayFatura = new Fatura[5];
        double totalDaFatura = 0;
        int i = 0;
        int codFatura = 1;
        
        
        String continuar = "S";
        
        
        while(continuar.equals("S") || continuar.equals("s") ){ 
 
        
        System.out.println("informe a descrição do produto");
        String produtoDescricao = input.next();
        
        System.out.println("informe a quantidade desejada");
        int produtoQtde = input.nextInt();
        
        System.out.println("informe o preço do produto");
        double produtoPreco = input.nextDouble();
        
                 
        arrayFatura[i] = new Fatura (produtoDescricao, produtoQtde, produtoPreco);
        int produtoQtde1 = produtoQtde;
                
        
         double valorDaFatura = arrayFatura[i].totalFaturado(produtoQtde1);
     
         totalDaFatura += valorDaFatura;
         
         System.out.println("qtd." + " " + "descrição" + " " + "V.unit" + " " + "sub-total");
         System.out.println(arrayFatura[i].quantidade + "  " + arrayFatura[i].descricao + "   " + arrayFatura[i].preco +"    " + valorDaFatura   ); // arrayFatura[i].subTotal(produtoQtde1)
         System.out.println("--------------");
       
         ++i;
         
            System.out.println("Deseja continuar comprando?");
            System.out.println("se sim digite [S], se não pressione qualquer tecla.");
      continuar    = input.next(); 
  
      }
        
        System.out.println("Fatura" + " " + "F00" + codFatura + " " + "Total" + " " +  totalDaFatura);
        codFatura ++;
      
        
    }
    
}
