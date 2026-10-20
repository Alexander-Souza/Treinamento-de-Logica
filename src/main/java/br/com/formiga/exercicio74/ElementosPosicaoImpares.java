package br.com.formiga.exercicio74;
/*Crie um programa que leia 10 números inteiros e exiba apenas os valores que
estão em posições ímpares no array.*/

import java.util.Scanner;

public class ElementosPosicaoImpares {
    void main() {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0){
                System.out.println("Numero é impar: "+numeros[i]);
            }
        }
    }
}
