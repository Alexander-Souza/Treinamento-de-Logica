package br.com.formiga.exercicio118;

import java.util.Scanner;

/* Desenvolva um método chamado ehMaiuscula() que receba um caractere e
retorne true se for uma letra maiúscula, e false se for uma letra minúscula. No método
main(), utilize o valor retornado para exibir a mensagem correspondente.*/
public class VerificarMaiusculo {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com uma letra, maiúscula pra saber se é verdadeira " +
                "ou minúscila para falso: ");
        String letra = input.nextLine();
        String texto = ehMauscula(letra);
        System.out.println(texto);
    }

    static String ehMauscula(String letra){
        if (letra.equals("A")){
            return "Verdadeiro";
        }
        return "Falso";
    }


}
