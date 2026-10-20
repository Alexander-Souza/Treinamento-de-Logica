package br.com.formiga.exercicio60;
/* Escreva um programa que leia números inteiros e exiba quantos desses
números são positivos. O programa deve parar quando o usuário digitar um número
negativo.*/
import java.util.Scanner;

public class ContagemPositivosWhile {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantPositiva = 0;

        System.out.println("Entre com numeros inteiros. Para parar o programa digite um numero negativo.");
        int numero = input.nextInt();

        while (numero > 0){
            quantPositiva ++;
            System.out.println("Entre com numeros inteiros. Para parar o programa digite um numero negativo.");
            numero = input.nextInt();
        }
        System.out.println("A quantidade de numeros positivos é: "+quantPositiva);
        input.close();
    }
}
