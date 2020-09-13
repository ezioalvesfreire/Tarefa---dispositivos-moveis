package programaretangulo;

public class Retangulo {

    private float comprimento;
    private float largura;

    public Retangulo(float comprimento, float largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento = 1f;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura = 1f;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public boolean validaRetangulo() {

        if (comprimento <= 0 || largura <= 0) {

            return false;
        }
        return true;
    }

    public void imprime() {
        if (comprimento == largura && comprimento != 0) {
            System.out.println("Farei o calculo, mas na verdade os dados informados é de um quadrado!");
            System.out.println("O valor da area eh: " + "" + this.calculaArea(comprimento, largura));
            System.out.println("O valor da area eh: " + "" + this.calculaPerimetro(comprimento, largura));
        } else if (validaRetangulo() == false) {
            System.out.println("Erro: Um dos lados do retângulo é igual ou menor que zero.");

        } else {

            System.out.println("O valor da area eh: " + "" + this.calculaArea(comprimento, largura));
            System.out.println("O valor da area eh: " + "" + this.calculaPerimetro(comprimento, largura));

        }

    }

    public float calculaPerimetro(float comprimento, float largura) {
        float perimetro = 0;
        validaRetangulo();
        perimetro = 2 * this.comprimento + 2 * this.largura;
        return perimetro;
    }

    public float calculaArea(float comprimento, float largura) {
        float area = 0;
        validaRetangulo();
        area = this.comprimento * this.largura;
        return area;
    }
}
