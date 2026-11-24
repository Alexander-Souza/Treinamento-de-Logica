package br.com.formiga.exercicio117;

import java.util.Scanner;

/*Escreva um método chamado calcularMedia() que receba três números inteiros
e retorne a média aritmética deles. No método main(), exiba a média retornada.*/
public class MediaAritimeticaRetorno {
    static void main(String[] args) {
        entradaDados();

    }

    public static void entradaDados(){
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.println("Entre com a segunda nota: ");
        double nota2 = input.nextDouble();
        System.out.println("Entre com a terceira nota: ");
        double nota3 = input.nextDouble();
        double media = calcularMedia(nota1, nota2, nota3);
        imprimir(media);

    }

    public static double calcularMedia(double nota1, double nota2, double nota3){
        return (nota1 + nota2 + nota3) / 3;
    }

    public static void imprimir(double media){
        System.out.printf("A media do aluno é: %.2f", media);
    }


}
