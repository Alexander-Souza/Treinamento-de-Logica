package br.com.formiga.exercicio134;

/*: Implemente uma classe Retangulo com os atributos largura e altura. Adicione
métodos para calcular a área e o perímetro do retângulo. No método main(), crie um objeto
Retangulo e exiba seus valores de área e perímetro.*/
public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo() {
        this.altura = altura;
        this.largura = largura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea(double largura, double altura) {
        return largura * altura;
    }

    public double calcularPerimetro(double largura, double altura) {
        return 2 * (largura + altura);
    }
}
