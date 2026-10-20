package br.com.formiga.exercicio80;

import java.util.Scanner;

/*Crie um programa que declare uma matriz 3x3 e permita que o usuário insira
valores inteiros para preencher essa matriz. Em seguida, exiba os valores da matriz no
console.*/
public class exercicio80 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] numeros = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite um numero para linha" + (i + 1) + " e coluna " + (i + 1) + ": ");
                numeros[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(numeros[i][j]);
            }
        }
    }
}
