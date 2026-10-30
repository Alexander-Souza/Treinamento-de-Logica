package br.com.formiga.exercicio110;

import java.util.Scanner;
/*
* Crie um método chamado obterSaudacao() que retorne a string "Olá, seja
bem-vindo!". No método main(), armazene o valor retornado em uma variável e exiba a
saudação.*/
public class Exercicio110 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String saudacao = obterSaudacao(input);
        System.out.println(saudacao);
    }

    public static String obterSaudacao(Scanner input){
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        return "Olá, bem vindo ao Java, "+nome+"!";
    }
}
