package br.com.formiga.exercicio76;

import java.util.Scanner;

/*Escreva um programa que leia 10 números inteiros e verifique se algum valor é
repetido no array. Se houver repetições, exiba uma mensagem informando.*/
public class VerificacaoRepeticao {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean reptido = false;

        for (int i = 0; i < numeros.length;i++){
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]){
                    reptido = true;
                    break;
                }
            }
        }

        if (reptido){
            System.out.println("Existe valores repetido no array.");
        }else {
            System.out.println("Não existe valores repetido no array.");
        }


    }
}
