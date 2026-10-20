package br.com.formiga.exercicio69;

import java.util.Scanner;

/*Desenvolva um programa que leia 10 números inteiros e armazene-os em um
array. Encontre e exiba o menor e o maior valor presentes no array.*/
public class exercicio69 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        int maior, menor;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = input.nextInt();
        }

       maior = menor = numeros[0];

        for(int numero : numeros){
            if (numero > maior){
                maior = numero;
            }

            if (numero < menor){
                menor = numero;
            }
        }
        System.out.println("o maior numero do array é: "+ maior);
        System.out.println("O menor numero do array é: "+ menor);
    }
}