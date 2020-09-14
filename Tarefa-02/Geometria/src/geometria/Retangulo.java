package geometria;

public class Retangulo extends Forma {
    /*
    
RETANGULO
------------------
#base: double
#altura: double
______________________
+Retangulo()
+Retangulo(base:double, altura: double)
+Retangulo(base: double, altura: double, cor: String, preenchido: boolean)
+getBase():double
+setBase(base: double): void
+getAltura():double
+setAltura(altura: double): void
+getArea(): double
+getPerimetro() double
+toString(): String
    */
    protected double base;
    protected double altura;

    public Retangulo(){
    
    
    }
    public Retangulo(double b, double h){
    
        this.setBase(b);
        this.setAltura(h);
    }
    public Retangulo(double b, double h, String c, boolean p){
        this.setBase(b);
        this.setAltura(h);
        this.setCor(c);
        this.setPreenchimento(p);
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

  /*  public String getCor() {  // não pede na UML
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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
    
    public boolean isPreenchimento() {
        return preenchimento;
    }

    /*
    public void setPreenchimento(boolean preenchimento) { // não pede na UML
        this.preenchimento = preenchimento;
    }
*/
     public String toString() {
    
     return "this.String que preciso retornar";
  // EX: return this.nome;
}
    
    
    
}
