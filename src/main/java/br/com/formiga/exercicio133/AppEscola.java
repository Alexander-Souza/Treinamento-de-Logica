package br.com.formiga.exercicio133;

public class AppEscola {
    static void main(String[] args) {
        Turma turma = new Turma();
        turma.setNome("A1");

        Aluno aluno = new Aluno();
        aluno.setNome("Alexander");
        aluno.setTurma(turma);

        aluno.imprimir();

    }
}
