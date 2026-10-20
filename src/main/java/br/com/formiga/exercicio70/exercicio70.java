package br.com.formiga.exercicio70;

import java.util.Scanner;

/*Escreva um programa que leia 15 números inteiros e, em seguida, exiba
quantos desses números são positivos e quantos são negativos.*/
public class exercicio70 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[15];
        int positivo = 0, negativo = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
        }

        for (int numero : numeros) {
            if (numero > 0) {
                positivo++;
            }
            if (numero < 0) {
                negativo++;
            }
        }

        System.out.println("A quantidade de numeros positivos é: " + positivo);
        System.out.println("A quantidade de numeros negativos é: " + negativo);
    }
}
