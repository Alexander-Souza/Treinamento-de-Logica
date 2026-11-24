package br.com.formiga.exercicio135;
/*: Crie uma classe Cilindro com os atributos raio e altura. Adicione um método
calcularVolume() que retorne o volume do cilindro (π * raio² * altura). No método main(), crie
um objeto Cilindro e exiba o volume.*/
public class Cilindrico {

    private double raio;
    private double altura;

    public Cilindrico(){
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularVolume(double raio, double altura){
        return (Math.PI * Math.pow(raio,2) * altura);
    }
}
