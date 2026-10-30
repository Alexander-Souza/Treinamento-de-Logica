package br.com.formiga.exercicio113;

import java.util.Scanner;

/*Escreva um método chamado calcularAreaRetangulo() que receba a largura e
a altura de um retângulo e retorne a área calculada. No método main(), exiba a área
retornada*/
public class CalcularArea {
    static void main(String[] args) {
        imprimir();
    }

    static double calcularAreaRetangular() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a largura: ");
        double largura = input.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = input.nextDouble();
        input.close();
        return largura * altura;

    }

    static void imprimir() {
        System.out.printf("A área calculada é %.2f", calcularAreaRetangular());
    }

}
