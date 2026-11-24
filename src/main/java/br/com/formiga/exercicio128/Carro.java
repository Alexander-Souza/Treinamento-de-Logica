package br.com.formiga.exercicio128;
/*Crie uma classe chamada Carro. Defina três atributos para a classe: marca,
modelo e ano. Em seguida, crie um objeto dessa classe no método main() e inicialize os
atributos com valores.*/
public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro() {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
