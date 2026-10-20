package br.com.formiga.exercicio64;
/*Crie um programa que exiba um menu de opções e permita ao usuário
escolher uma ação (como somar dois números, subtrair, etc.). O menu deve continuar
sendo exibido até o usuário escolher a opção de sair.*/

import java.util.Scanner;

public class MenuOpcaoDoWhile {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha a opção desejada:\n" +
                    "1 -> soma\n" +
                    "2 -> subtrair\n" +
                    "3 -> multiplicar\n" +
                    "4 -> divisão\n" +
                    "5 -> resto da divisão\n" +
                    "6 -> sair do programa");
            opcao = input.nextInt();

            if (opcao >= 1 && opcao <= 4){
                System.out.println("Digite o primeiro numero: ");
                int numero1 = input.nextInt();
                System.out.println("Digite o segundo numero: ");
                int numero2 = input.nextInt();

                switch (opcao){
                    case 1:
                        int soma = numero1 + numero2;
                        System.out.println("soma = "+soma);
                        break;
                    case 2:
                        int sub = numero1 - numero2;
                        System.out.println("soma = "+sub);
                        break;
                    case 3:
                        int mult = numero1 * numero2;
                        System.out.println("soma = "+mult);
                        break;
                    case 4:
                        int div = numero1 / numero2;
                        System.out.println("soma = "+div);
                        break;
                    case 5:
                        int resto = numero1 % numero2;
                        System.out.println("soma = "+resto);
                        break;

                                   }

            }else if (opcao != 6){
                System.out.println("Opção incorreta, escolha a opção certa.");
            }

        } while (opcao != 6);
        System.out.println("programa encerrado...");
    }
}
