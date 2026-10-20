package br.com.formiga.exercicio70;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio70v1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int positivo = 0, negativo = 0;

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite um numero: ");
            numeros.add(input.nextInt());
        }

        for (int numero : numeros) {
            if (numero > 0) {
                positivo++;
            }
            if (numero < 0) {
                negativo++;
            }
        }

        System.out.println("A quantidade de numeros positivos: " + positivo);
        System.out.println("A quantidade de numeros negativos: " + negativo);
    }
}
