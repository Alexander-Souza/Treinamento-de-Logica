package br.com.formiga.exercicio136;

/*Implemente uma classe Aluno com os atributos nome, nota1 e nota2. Adicione
um método calcularMedia() que calcule e retorne a média das duas notas. No método
main(), crie um aluno e exiba sua média.*/
public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno() {
        this.nome = nome;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public void imprimir(){
        System.out.printf("O aluno(a) %s esta com a media %.2f", getNome(),calcularMedia());
    }
}
