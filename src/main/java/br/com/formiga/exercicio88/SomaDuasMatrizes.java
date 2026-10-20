package br.com.formiga.exercicio88;
/* Escreva um programa que leia duas matrizes 3x3 e calcule a soma entre elas,
exibindo a matriz resultante.*/

import java.util.Scanner;

public class SomaDuasMatrizes {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] numeros1 = new int[3][3];
        int[][] numeros2 = new int[3][3];
        int[][] somas = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite um numero na linha " + (i + 1) + " e coluna " + (i + 1) + ": ");
                numeros1[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite um numero na linha " + (i + 1) + " e coluna " + (i + 1) + ": ");
                numeros2[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somas[i][j] = numeros1[i][j] +numeros2[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("A soma da matriz é: "+ somas[i][j]);
            }
        }

    }
}
