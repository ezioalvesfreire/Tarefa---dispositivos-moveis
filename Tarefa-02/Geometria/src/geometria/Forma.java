package geometria;

public abstract class Forma {
    
    // OBS: TORNAR ESTA CLASSE ABSTRATA APÓS CRIAR OS ATRIBUTOS E METODOS DE DELA E DE TODAS OUTRAS CLASSES
/*   
FORMA
---------------
# cor: String
#preenchimento: boolean
_____________________
+ Forma()                  
+ Forma(cor: String, preenchimento: boolean)  
+ getCor(): String
+ setCor(cor: String): void
+ ispreenchido():boolean
+ setPreenchido(preenchido: boolean):void
+ getArea(): double
+ getPerimetro():double
+ toString(): String

 */
   
   protected String cor; 
   protected boolean preenchimento;
   double area;              // não especificado na UML
   double perimetro;         // não especificado na UML

 
   public Forma(){
   
  }
   public Forma(String c, boolean p){
        this.setCor(c);
        this.setPreenchimento(p);
   }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isPreenchimento() {
        return preenchimento;
    }

    public void setPreenchimento(boolean preenchimento) {
        this.preenchimento = preenchimento;
    }
    
       public double getArea() {
        return area;
    }

   /* public void setArea(double area) { // não pedido na UML
        this.area = area;
    }
*/
    public double getPerimetro() {
        return perimetro;
    }

   /* public void setPerimetro(double perimetro) { // não pedido na UML
        this.perimetro = perimetro;
    }
  */ 
    
    public String toString() {
    
     return "this.String que preciso retornar";
  // EX: return this.nome;
}
    
}
