package br.com.formiga.exercicio111;

import java.util.Scanner;

/*
* Implemente um método chamado somar() que receba dois números inteiros
como parâmetros, calcule a soma e retorne o resultado. No método main(), capture o valor
retornado e exiba-o*/
public class SomaRetorno {
    static void main(String[] args) {
        imprimir();
    }

    public static int soma() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite primeiro numero: ");
        int numero1 = input.nextInt();
        System.out.print("Digite segundo numero: ");
        int numero2 = input.nextInt();

        return numero1 + numero2;
    }

    static void imprimir(){
        System.out.println("A soma dos valores é: " + soma());
    }
}
