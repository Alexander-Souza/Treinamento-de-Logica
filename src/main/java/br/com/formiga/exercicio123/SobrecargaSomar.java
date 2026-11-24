package br.com.formiga.exercicio123;

/*Implemente uma classe com dois métodos chamados somar(). O primeiro
método deve receber dois números inteiros como parâmetros e retornar a soma deles. O
segundo método deve receber três números inteiros e retornar a soma dos três. No método
main(), teste os dois métodos chamando-os com diferentes quantidades de parâmetros.*/
public class SobrecargaSomar {
    static void main(String[] args) {
        System.out.println("A soma dos valores é: " + soma(5, 6));
        System.out.println("A soma do segundo valor é: " + soma(8, 9, 7));

    }

    static int soma(int a, int b) {
        return a + b;
    }

    static int soma(int a, int b, int c) {
        return a + b + c;
    }
}
