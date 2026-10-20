package br.com.formiga.exercicio65;

import java.util.ArrayList;

public class CriacaoInicializacaoArrayV1 {
    static void main() {
        ArrayList<Integer>numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        for (Integer numero:numeros){
            System.out.println("Elementos "+numero);
        }
    }
}
