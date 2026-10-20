package br.com.formiga.exercicio102;
/*Escreva um programa que leia 10 números inteiros e exiba a frequência de
cada número, ou seja, quantas vezes cada número aparece no array.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercicio102 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        Map<Integer, Integer> frequencia = new HashMap<>();

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero na posição "+(i + 1)+": ");
            numeros[i] = input.nextInt();
            frequencia.put(numeros[i], frequencia.getOrDefault(numeros[i], 0) + 1);
        }

        System.out.println("Frequencia de cada número:");
        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            System.out.println("Número: " + entry.getKey() + " aparece " + entry.getValue() + " vezes.");
        }

    }
}
