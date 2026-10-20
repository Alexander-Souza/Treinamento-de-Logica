package br.com.formiga.exercicio101;
/* Crie um programa que leia dois arrays de 10 números inteiros e exiba a união
dos dois arrays (todos os números, sem repetição).*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercicio101 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrayA = new int[10];
        int[] arrayB = new int[10];
        Set<Integer> uniao = new HashSet<>();

        for (int i = 0; i < arrayA.length; i++) {
            System.out.print("Digite um numero na posição " + (i + 1) + ", para arrayA: ");
            arrayA[i] = input.nextInt();
            uniao.add(arrayA[i]);
        }

        for (int i = 0; i < arrayB.length; i++) {
            System.out.print("Digite um numero na posição " + (i + 1) + ", para arrayB: ");
            arrayB[i] = input.nextInt();
            uniao.add(arrayA[i]);
        }

        for (int uni : uniao) {
            System.out.println("Os numeros da união é: " + uni);
        }


    }
}
