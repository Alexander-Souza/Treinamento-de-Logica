package br.com.formiga.exercicio61;

import java.util.Scanner;

/*Crie um programa que leia um número inteiro positivo e encontre a raiz
quadrada aproximada desse número. Continue a tentativa até encontrar a aproximação
correta.*/
public class RaizQuadradaAproximadaWhile {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int raizAprox = 0;

        System.out.println("Digite um numero inteiro positivo: ");
        int numero = input.nextInt();

        while (raizAprox * raizAprox < numero) {
            raizAprox++;
        }

        if (raizAprox * raizAprox == numero) {
            System.out.println("A raiz quadrada exata de " + numero + " é: " + raizAprox);
        } else {
            System.out.println("A raiz quadrada aproximada de " + numero + " é " + raizAprox);
        }
    }
}
