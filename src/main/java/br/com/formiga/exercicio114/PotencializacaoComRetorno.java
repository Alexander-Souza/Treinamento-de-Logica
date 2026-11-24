package br.com.formiga.exercicio114;

import java.util.Scanner;

/*Implemente um método chamado potencia() que receba dois números inteiros
(base e expoente) e retorne o resultado da potenciação. No método main(), capture e exiba
o valor retornado.*/
public class PotencializacaoComRetorno {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com a base: ");
        int base = input.nextInt();
        System.out.println("Entre com o expoente: ");
        int expoente = input.nextInt();
        int resultado = potencia(base, expoente);
        imprimir(resultado);
    }

    public static int potencia(int base, int expoente){

        return (int) Math.pow(base, expoente);
    }

    public static void imprimir(int resultado){
        System.out.println("O resultado da potencia é: "+resultado);
    }
}
