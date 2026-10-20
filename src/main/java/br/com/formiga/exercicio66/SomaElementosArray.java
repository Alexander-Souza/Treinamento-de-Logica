package br.com.formiga.exercicio66;
/*Desenvolva um programa que leia 5 números inteiros do usuário, armazene-os
em um array e calcule a soma de todos os elementos.*/
import java.util.Scanner;

public class SomaElementosArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Entre com um numeros no indice "+i+": ");
            numeros[i] = input.nextInt();
            soma += numeros[i];
        }
        System.out.println("A somatoria dos numeros é: "+soma);
    }
}
