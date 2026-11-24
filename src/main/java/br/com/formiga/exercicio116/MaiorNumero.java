package br.com.formiga.exercicio116;

import java.util.Scanner;

/*Crie um método chamado obterMaior() que receba dois números inteiros e
retorne o maior deles. No método main(), capture o valor retornado e exiba o maior número.*/
public class MaiorNumero {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = input.nextInt();
        int maior = obterMaior(numero1, numero2);
        System.out.println("o maior entre os números é: "+maior);
    }
    public static int obterMaior(int x, int y){
        int maior=0;
        if (x > y){
            return maior = x;
        }
        return maior = y;
    }

}
