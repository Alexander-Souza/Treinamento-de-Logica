package br.com.formiga.exercicio133;

import java.sql.SQLOutput;

/*Crie duas classes: Aluno e Turma. A classe Turma deve ter o atributo nome e
um método para exibir o nome da turma. A classe Aluno deve ter os atributos nome e turma,
sendo turma do tipo Turma. No método main(), crie objetos das duas classes e exiba as
informações.*/
public class Turma {
    private String nome;

    public Turma(){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void nomeTurma(){
        System.out.println("Nome da Turma: "+nome);
    }
}
