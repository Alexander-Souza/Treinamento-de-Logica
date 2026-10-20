package br.com.formiga.exercicio77;

import java.util.Scanner;

/*: Crie um programa que leia 6 números inteiros e calcule o produto de todos os
valores do array.*/
public class exercicio77 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[6];
        int multi = 1;

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
            multi *= numeros[i];
        }

        System.out.println("O calculo do produto é: "+multi);


    }
}
