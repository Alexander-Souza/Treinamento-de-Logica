package br.com.formiga.exercicio71;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio71v1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite um numero: ");
            numeros.add(input.nextInt());
        }
        System.out.println("O numero reverso = " + numeros.reversed());
    }
}
