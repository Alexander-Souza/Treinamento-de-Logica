package br.com.formiga.exercicio107;
/*Crie um método chamado somar() que receba dois números inteiros como
parâmetros, calcule a soma deles e exiba o resultado no console. No método main(), solicite
dois números do usuário, chame o método e exiba o resultado.*/
import java.util.Scanner;

public class exercicio107 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        int num1 = input.nextInt();
        System.out.println("Entre com o segundo numero: ");
        int num2 = input.nextInt();

        int resultado = soma(num1, num2);

        saida(resultado);

    }

    static int soma(int a, int b){
        return  a + b;
    }

    static void saida(int res){
        System.out.println("A soma dos valores: "+res);
    }


}
