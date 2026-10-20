package br.com.formiga.exercicio58;

import java.util.Scanner;

/*Crie um programa que leia um número inteiro entre 1 e 10. Caso o valor seja
inválido, continue pedindo a entrada até que um número válido seja fornecido.*/
public class ValidacaoDeEntradaWhile {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro entre 1 e 10:");
        int numero = input.nextInt();

        while (numero < 1 || numero > 10){
            System.out.println("Numero invalido, Tente novamente...");
            System.out.println("Entre com um valor inteiro entre 1 e 10:");
            numero = input.nextInt();
        }
        System.out.println("Numero valido: "+ numero);
        input.close();
    }


}
