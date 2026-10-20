package br.com.formiga.exercicio108;

import java.util.Scanner;

/*: Implemente um método chamado verificarParidade() que receba um número
inteiro como parâmetro e exiba se o número é par ou ímpar. No método main(), chame o
método para testar com diferentes números.*/
public class exercicio108 {
    static void main(String[] args) {
        int x=0;
        int y=0;
        verificarParidade(x, y);
    }
    static void verificarParidade(int a, int b){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        a = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = input.nextInt();

        if(a % 2 == 0 && b % 2 == 0){
            System.out.println("E Par...");
        }else if (a % 2 == 1 && b % 2 == 1){
            System.out.println("E Impar...");
        }else {
            System.out.println("Nenhuma das opções");
        }


    }
}
