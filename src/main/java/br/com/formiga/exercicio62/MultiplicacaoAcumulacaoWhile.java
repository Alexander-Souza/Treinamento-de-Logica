package br.com.formiga.exercicio62;

import java.util.Scanner;

/* Desenvolva um programa que leia um número e multiplique esse número por 2
repetidamente até o valor exceder 1000.*/
public class MultiplicacaoAcumulacaoWhile {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int multiAcumul = 0;

        System.out.println("Digite um numero inteiro: ");
        int numero = input.nextInt();

        while (multiAcumul <= 1000){
            numero *= 2;
            multiAcumul += numero;

            System.out.println("Digite um numero inteiro: ");
            numero = input.nextInt();
        }
        System.out.println("o valor da multiplicação acumulada é: "+multiAcumul);
        input.close();
    }
}
