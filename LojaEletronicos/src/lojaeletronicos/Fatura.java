package lojaeletronicos;
public class Fatura {
 // String codigoFatura;
    String descricao;
    int quantidade;
    double preco;
 //   int codFatura = 1; ////

   Fatura( String d, int q, double p) { //String codigoFatura,
     
        ///codigoFatura = codigoFatura;
        descricao = d;
        quantidade = q;
        preco = p;
       
       }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double totalFaturado(int q){
        System.out.println("método que calcula a fatura!!!");
  double totalFaturado = this.preco * quantidade;

    return totalFaturado;
    } 
    
    public static int geraCodFatura(int codFatura){
    
        
        codFatura = codFatura ++;
    
    return codFatura;
    
    }
     
}
