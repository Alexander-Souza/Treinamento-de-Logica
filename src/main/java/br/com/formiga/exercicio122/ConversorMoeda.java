package br.com.formiga.exercicio122;

import java.util.Scanner;

/*Crie um método chamado converterRealParaDolar() que receba um valor em
reais e retorne o valor convertido em dólares. No método main(), exiba o valor convertido.
Considere a taxa de câmbio fixa de 1 dólar = 5,00 reais.*/
public class ConversorMoeda {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o valor a ser convertido: ");
        double valorReal = input.nextDouble();

        double valorDolar = converterRealParaDolar(valorReal);

        saida(valorDolar);
    }

    public static double converterRealParaDolar(double real){
        return real / 5.50;
    }

    public static void saida(double resultado){
        System.out.printf("O valor do real convertido em dolar é U$: %.2f", resultado);
    }
}
