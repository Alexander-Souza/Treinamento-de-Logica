package br.com.formiga.exercicio121;

import java.util.Scanner;

/* Implemente um método chamado contarVogais() que receba uma string como
parâmetro e retorne a quantidade de vogais presentes na string. No método main(), exiba o
valor retornado.*/
public class ContagemVogais {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = input.nextLine();

        int quantVogais = contarVogais(palavra);

        saida(quantVogais);

    }

    public static int contarVogais(String palavra){
        String vogais = "aeiouAEIOU";
        int contador = 0;

        for(int i = 0; i < palavra.length();i++){
            if (vogais.indexOf(palavra.charAt(i)) != -1){
                contador++;
            }
        }
        return contador;
    }

    public static void saida(int quant){
        System.out.println("A quantidade de vogais é: "+quant);
    }


}
