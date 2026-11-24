package br.com.formiga.exercicio115;

import java.util.Scanner;

/*Desenvolva um método chamado converterCelsiusParaFahrenheit() que
receba uma temperatura em graus Celsius e retorne o valor em Fahrenheit. No método
main(), exiba a temperatura convertida.*/
public class ConversaoTemperatura {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com a temperatura em graus Celsius: ");
        int celsius = input.nextInt();
        int temperatura = converterCelsiusParaFahrenheit(celsius);
        imprimir(temperatura);

    }

    public static int converterCelsiusParaFahrenheit(int celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void imprimir(int temp) {
        System.out.println("A temperatura em Fahrenheit é: " + temp);
    }
}
