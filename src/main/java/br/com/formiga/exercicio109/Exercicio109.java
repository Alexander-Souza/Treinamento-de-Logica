package br.com.formiga.exercicio109;

import java.util.Scanner;

/*
* Desenvolva um método chamado calcularAreaRetangulo() que receba a
largura e a altura de um retângulo como parâmetros e exiba a área no console. No método
main(), solicite os valores ao usuário, chame o método e exiba o resultado.*/
public class Exercicio109 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com a largura: ");
        double largura = input.nextDouble();
        System.out.print("Entre com a altura: ");
        double altura = input.nextDouble();

        calcularAreaRetangulo(largura, altura);
        input.close();
    }

    public static void calcularAreaRetangulo(double largura, double altura){
        double area = largura * altura;
        saida(area);
    }

    public static void saida(double area){
        System.out.printf("A area de um retangulo é: %.2f", area);
    }
}
