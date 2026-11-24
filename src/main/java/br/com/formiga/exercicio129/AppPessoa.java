package br.com.formiga.exercicio129;

import java.util.Scanner;

public class AppPessoa {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        System.out.print("Digite o nome da pessoa: ");
        pessoa1.setNome(input.nextLine());
        System.out.print("Digite a idade: ");
        pessoa1.setIdade(input.nextInt());

        pessoa1.imprimir();

        System.out.print("Digite o nome da pessoa: ");
        pessoa2.setNome(input.next());
        System.out.print("Digite a idada: ");
        pessoa2.setIdade(input.nextInt());

        pessoa2.imprimir();

    }
}
