package br.com.formiga.exercicio137;

/*Crie uma classe Calculadora com métodos estáticos somar(), subtrair(),
multiplicar(), dividir(), que realizam as operações matemáticas básicas. No método main(),
chame esses métodos sem criar um objeto.*/
public class Calculadora {
    private int numero1;
    private int numero2;

    public Calculadora() {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void soma(int numero1, int numero2) {
        int soma = numero1 + numero2;
        System.out.println("Soma: " + soma);
    }

    public void subtrair(int numero1, int numero2) {
        int subtr = numero1 - numero2;
        System.out.println("Subtrair: " + subtr);
    }

    public void multiplicar(int numero1, int numero2) {
        int multi = numero1 * numero2;
        System.out.println("Multiplicação: " + multi);
    }

    public void dividir(int numero1, int numero2) {
        int div = numero1 / numero2;
        System.out.println("Divisão: " + div);
    }

    static void soma1(int numero1, int numero2){
        int soma = numero1 + numero2;
        System.out.println("A soma: "+soma);
    }
}
