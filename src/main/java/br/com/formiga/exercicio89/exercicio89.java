package br.com.formiga.exercicio89;
/*Crie um programa que leia uma matriz 5x5 e conte quantos números pares
existem na matriz. Exiba o total de números pares encontrados.*/

import java.util.Scanner;

public class exercicio89 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] numeros = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Digite um numero para linha " + (i + 5) + " e coluna " + (i + 5) + ": ");
                numeros[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (numeros[i][j] % 2 == 0){
                    System.out.println("Numero PAR: "+ numeros[i][j]);
                }
            }
        }

    }
}
