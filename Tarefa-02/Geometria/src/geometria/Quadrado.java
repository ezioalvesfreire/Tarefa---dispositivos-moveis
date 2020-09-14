package geometria;

public class Quadrado extends Retangulo {

       /*
    QUADRADo
---------------
+quadrado()
+quadrado(lado: double)
+quadrado(lado: double, cor: String, preenchido: boolean)
+getLado():double
+setLado(lado: double) : void
+toString(): String

    */
    
    protected double lado; 

   
    
    public Quadrado(){
    
    }
    public Quadrado(double l){
        this.setLado(l);
    
    }
    public Quadrado(double l,String c, boolean p){
        this.setLado(l);
        this.setCor(c);
        this.isPreenchimento();
    
    }
    
    
    
    
 /*   
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

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
 */
     public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public String toString() {
    
     return "this.String que preciso retornar";
  // EX: return this.nome;
}
    
}
