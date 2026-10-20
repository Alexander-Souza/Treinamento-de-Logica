package br.com.formiga.exercicio67;

import java.util.Scanner;

/*Escreva um programa que leia 10 números inteiros e calcule a média dos
valores inseridos, utilizando um array para armazenar os números.*/
public class MediaValoresArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        int somatoria = 0;
        int media = 0;

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite o numero no indice: "+(i+1)+": ");
            numeros[i]= input.nextInt();
            somatoria += numeros[i];
            media = somatoria / 10;
        }
        System.out.println("A media do Array é: "+media);

    }
}
