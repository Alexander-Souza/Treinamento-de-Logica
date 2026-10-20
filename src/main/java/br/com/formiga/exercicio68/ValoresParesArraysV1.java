package br.com.formiga.exercicio68;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValoresParesArraysV1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer>numeros = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite um numero: ");
            numeros.add(input.nextInt());
        }

        for (int numero: numeros){
            if (numero % 2 == 0){
                System.out.println("É Par: "+numero);
            }
        }
    }
}
