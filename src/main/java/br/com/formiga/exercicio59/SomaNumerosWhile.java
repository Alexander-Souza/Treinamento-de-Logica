package br.com.formiga.exercicio59;
/*Desenvolva um programa que leia números inteiros do usuário e exiba a soma
acumulada. O programa deve terminar quando o usuário digitar o número zero.*/

import java.util.Scanner;

public class SomaNumerosWhile {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int somaAcumulada = 0;

        System.out.println("Entre com um numero: ");
        int numero = input.nextInt();

        while (numero != 0) {
            somaAcumulada += numero;
            System.out.println("Entre com um numero: ");
            numero = input.nextInt();
        }
        System.out.println("A soma acumulada dos numeros é: " + somaAcumulada);
        input.close();
    }
}
