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
        
        // Retangulo r1 = new Retangulo("COMPACTOR", "VERDE", 0.8f);
           Retangulo r1 = new Retangulo(comprimento, largura);
      
         
        //  areaTotal = calculaArea( comprimento, largura);
        //  areaTotal = calculaArea();
        
        System.out.println("O valor da area eh: " + "" + r1.calculaArea(comprimento, largura) ) ;
        
        
        System.out.println("O valor do perimetro eh: " + "" + r1.calculaPerimetro(comprimento, largura));
        
      
        
               
                
               
                
    }
  
    
}
