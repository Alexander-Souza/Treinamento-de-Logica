package br.com.formiga.exercicio67;

import java.util.ArrayList;
import java.util.Scanner;

public class MediaValoresArrayV1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;
        double media = 0;

        for (int i = 0; i < 10 ; i++) {
            System.out.print("Digite um numero: ");
            numeros.add(input.nextInt());
        }

        for (int numero:numeros){
            soma += numero;
            media = soma / 10;
        }
        System.out.println("A media do Array é: "+media);
    }
}
