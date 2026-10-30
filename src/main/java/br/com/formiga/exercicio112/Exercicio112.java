package br.com.formiga.exercicio112;

import java.util.Scanner;

/* Desenvolva um método chamado ehPar() que receba um número inteiro como
parâmetro e retorne true se o número for par e false se for ímpar. No método main(), utilize
o valor retornado para exibir a mensagem correspondente.*/
public class Exercicio112 {
    static void main(String[] args) {
        imprimir();
    }

    static String ehPar(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero para saber se é 'PAR' ou 'IMPAR': ");
        int numero = input.nextInt();

        if (numero % 2 == 0){
            return "PAR";
        }
        return "IMPAR";
    }

    static void imprimir(){
        System.out.println(ehPar());
    }
}
