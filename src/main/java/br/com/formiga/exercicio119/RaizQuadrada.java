package br.com.formiga.exercicio119;

import java.sql.SQLOutput;
import java.util.Scanner;

/*: Implemente um método chamado calcularRaizQuadrada() que receba um
número inteiro e retorne a raiz quadrada desse número. No método main(), capture e exiba
o valor retornado.*/
public class RaizQuadrada {
    static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Digite um numero: ");
      int numero = input.nextInt();

      double resultado = calcularRaizQuadrada(numero);
      saida(resultado);
    }
    public static double calcularRaizQuadrada(int num){
        return Math.sqrt(num);
    }

    public static void saida(double res){
        System.out.printf("A raiz quadrada é: %.2f", res);
    }
}
