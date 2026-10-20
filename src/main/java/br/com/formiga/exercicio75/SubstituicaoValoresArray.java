package br.com.formiga.exercicio75;
/*Desenvolva um programa que crie um array de 10 números inteiros. O
programa deve pedir ao usuário que forneça dois números: um número para buscar no
array e outro para substituir o número encontrado. Se o número for encontrado, ele deve ser
substituído.*/

import java.util.Scanner;

public class SubstituicaoValoresArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        int num;
        int novo;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
        }

        System.out.print("Entre com um numero: ");
        num = input.nextInt();
        System.out.print("Digite um novo numero: ");
        novo = input.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                num = novo;
                numeros[i] = num;
            }
            System.out.println("O array atualizado com o novo numero : " + numeros[i]);
        }
        input.close();
    }
}
