package br.com.formiga.exercicio103;
/*Desenvolva um programa que leia 10 números inteiros e separe os números
pares dos números ímpares em dois arrays diferentes. Exiba os dois arrays.*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio103 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero na posição "+(i+1)+": ");
            numeros[i] = input.nextInt();
        }

        for (int numero:numeros){
            if (numero % 2 == 0){
                pares.add(numero);
            }else {
                impares.add(numero);
            }
        }
        System.out.println("Os numeros pares é: "+pares);
        System.out.println("Os numeros impares é: "+impares);
    }
}
