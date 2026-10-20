package br.com.formiga.exercicio73;
/*: Escreva um programa que crie um array de 5 números inteiros e multiplique
todos os seus valores por 2, exibindo o novo array no console.*/
import java.util.Scanner;

public class exercicio73 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];


        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Entre com um numero: ");
            numeros[i] = input.nextInt();
        }

        for (int numero: numeros){
            numero *= 2;
            System.out.println(numero);
        }

    }
}
