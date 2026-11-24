package br.com.formiga.exercicio133;
/*Crie duas classes: Aluno e Turma. A classe Turma deve ter o atributo nome e
um método para exibir o nome da turma. A classe Aluno deve ter os atributos nome e turma,
sendo turma do tipo Turma. No método main(), crie objetos das duas classes e exiba as
informações.*/
public class Aluno {
    private String nome;
    private Turma turma;

    public Aluno(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void imprimir(){
        System.out.println("Nome aluno: "+ nome);
        this.turma.nomeTurma();
    }


}
