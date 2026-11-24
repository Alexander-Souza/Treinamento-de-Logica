package br.com.formiga.exercicio137;

public class AppCalculadora {
    static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora();

        calculadora1.setNumero1(5);
        calculadora1.setNumero2(8);
        calculadora1.soma(calculadora1.getNumero1(), calculadora1.getNumero2());
        calculadora1.subtrair(calculadora1.getNumero1(), calculadora1.getNumero2());
        calculadora1.multiplicar(calculadora1.getNumero1(), calculadora1.getNumero2());
        calculadora1.dividir(calculadora1.getNumero1(), calculadora1.getNumero2());


    }
}
