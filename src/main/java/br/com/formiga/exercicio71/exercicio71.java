package br.com.formiga.exercicio71;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/* Crie um programa que leia 6 números inteiros e armazene-os em um array.
Depois, exiba os valores do array na ordem inversa*/
public class exercicio71 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
        }

        for (int i = numeros.length - 1; i >=0; i--) {
            System.out.println(numeros[i]);
        }

    }
}
