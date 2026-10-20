package br.com.formiga.exercicio63;

import java.util.Scanner;

/* Escreva um programa que peça ao usuário para digitar uma senha. Continue
pedindo a senha até que a senha correta seja digitada.
*/
public class SenhaCorretaWhile {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 1;

        do {
            System.out.print("Login: ");
            String login = input.nextLine();
            System.out.print("Senha: ");
            String senha = input.nextLine();
            if (login.equalsIgnoreCase("Alexander") && senha.equalsIgnoreCase("1234")) {
                System.out.println("Login e Senha correto, sistema sendo acessado...");
                break;
            } else {
                System.out.println("Login e Senha incorreta, tente novamente....");
                System.out.println("Três tentativa, 3 de "+ contador);
            }
            contador++;
        } while (contador <= 3);

        input.close();
    }
}
