package br.com.formiga.exercicio72;

import java.util.Scanner;

/*Desenvolva um programa que leia 10 números inteiros e armazene-os em um
array. O programa deve pedir ao usuário para inserir um número extra e contar quantas
vezes esse número aparece no array.*/
public class ContagemOcorrencia {
    void main(){
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        int cont = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
        }

        System.out.print("Entre com um numero extra: ");
        int numeroExtra = input.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroExtra){
                cont++;
            }
        }
        System.out.println("O numero aparece no array: "+cont+", vezes");
    }
}
