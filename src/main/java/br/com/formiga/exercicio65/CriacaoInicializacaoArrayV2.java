package br.com.formiga.exercicio65;

import java.util.ArrayList;
import java.util.Scanner;

public class CriacaoInicializacaoArrayV2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer>numeros = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            System.out.print("Entre com os numeros solicitados: ");
            numeros.add(input.nextInt());
        }

        for (Integer numero:numeros){
            System.out.println("Elementos: "+numero );
        }

        numeros.remove(1);

        System.out.println("++++++++++++++++++++++++++++");
        for (Integer numero:numeros){
            System.out.println("Elementos: "+numero );
        }

        input.close();
    }
}
