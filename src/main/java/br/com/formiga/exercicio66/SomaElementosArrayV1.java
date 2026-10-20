package br.com.formiga.exercicio66;
/*Desenvolva um programa que leia 5 números inteiros do usuário, armazene-os
em um array e calcule a soma de todos os elementos.*/

import java.util.ArrayList;
import java.util.Scanner;

public class SomaElementosArrayV1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero: ");
            numeros.add(input.nextInt());
        }
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println("A soma dos numeros é: " + soma);
    }
}
