package geometria;

public class Circulo extends Forma {
    
    /*
    CIRCULO
--------------------
#raio: double
_____________________

+Circulo()
+Circulo(raio: double)
+Circulo(raio: double, cor: String, preenchido: boolean)
+getRaio(): double
+setRaio(raio: double) : void
+ getArea(): double
+getPerimetro(): double
+toString(): String

    */
    
        protected double raio;
        
    public Circulo(){
    
    }
     public Circulo(double r){
         this.setRaio(r);
    }
      public Circulo(double r,String c,boolean p){
          this.setRaio(r);
          this.setCor(c);
          this.isPreenchimento();
    
    }
    

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
/*
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
*/
    public double getArea() {
        return area;
    }
/*
    public void setArea(double area) {
        this.area = area;
    }
*/
    public double getPerimetro() {
        return perimetro;
    }
/*
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
 */   
    
    public String toString() {
    
     return "this.String que preciso retornar";
  // EX: return this.nome;
}
    
}
