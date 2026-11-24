package br.com.formiga.exercicio135;

import java.util.Scanner;

public class AppCilindrico {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cilindrico cilindrico = new Cilindrico();

        System.out.print("Entre com o raio: ");
        cilindrico.setRaio(input.nextDouble());
        System.out.print("Entre com a altura: ");
        cilindrico.setAltura(input.nextDouble());

        System.out.println("O volume do cilindrico é: "+cilindrico.calcularVolume(cilindrico.getRaio(), cilindrico.getAltura()));
    }
}
