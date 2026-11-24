package br.com.formiga.exercicio124;

/*: Desenvolva uma classe que contenha dois métodos sobrecarregados
chamados calcularArea(). O primeiro método deve calcular e retornar a área de um
quadrado, recebendo o comprimento de um dos lados como parâmetro. O segundo método
deve calcular e retornar a área de um retângulo, recebendo a largura e a altura como
parâmetros. No método main(), teste os dois métodos.*/
public class SobrecargaCalcularArea {
    static void main(String[] args) {
        System.out.printf("Calcular a área de um quadrado: %.2f\n", calcularArea(8));
        System.out.printf("Calcular a área de um retângulo: %.2f", calcularArea(2.85, 1.55));
    }

    static double calcularArea(double lado){
        return lado*lado;
    }
    static double calcularArea(double comprimento, double largura){
        return comprimento * largura;
    }

}
