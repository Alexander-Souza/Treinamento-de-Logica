package br.com.formiga.exercicio69;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio69V1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int maior, menor;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeros.add(input.nextInt());
        }

        maior = menor = numeros.size();

        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O maior numero do array: " + maior);
        System.out.println("O menor numero do array: " + menor);
    }
}
