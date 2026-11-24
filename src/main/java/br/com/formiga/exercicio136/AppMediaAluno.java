package br.com.formiga.exercicio136;

import java.util.Scanner;

public class AppMediaAluno {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Entre com nome do aluno: ");
        aluno.setNome(input.next());
        System.out.println("Digite a primeira nota: ");
        aluno.setNota1(input.nextDouble());
        System.out.println("Digite a segunda nota: ");
        aluno.setNota2(input.nextDouble());

        aluno.calcularMedia();
        aluno.imprimir();
    }
}
