package br.com.formiga.exercicio68;
/*Crie um programa que leia 8 números inteiros e exiba todos os valores pares
armazenados no array.
*/
import java.util.Scanner;

public class ValoresParesArrays {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0){
                System.out.println("É Par "+ numeros[i]);
            }
        }

        input.close();

    }
}
