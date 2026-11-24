package br.com.formiga.exercicio134;

import java.util.Scanner;

public class AppRetangulo {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.print("Entre com a largura: ");
        retangulo.setLargura(input.nextDouble());
        System.out.print("Entre com a altura: ");
        retangulo.setAltura(input.nextDouble());

        double area = retangulo.calcularArea(retangulo.getLargura(), retangulo.getAltura());

        System.out.println("o tamanho da area é: " + area);

        double perimetro = retangulo.calcularPerimetro(retangulo.getLargura(), retangulo.getAltura());

        System.out.println("O perimetro solicitado é: " + perimetro);
    }
}
