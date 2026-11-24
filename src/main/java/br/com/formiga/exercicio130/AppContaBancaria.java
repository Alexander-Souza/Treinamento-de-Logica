package br.com.formiga.exercicio130;

public class AppContaBancaria {
    static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("253659", 365.69);
        ContaBancaria contaBancaria1 = new ContaBancaria("123456", 1000);

        contaBancaria.imprimir();

        contaBancaria.setSaldo(563.98);

        contaBancaria.imprimir();

        contaBancaria.depositar(200);

        contaBancaria.imprimir();

        contaBancaria.sacar(400);

        contaBancaria.imprimir();

        contaBancaria.sacar(363.98);

        contaBancaria.imprimir();

        contaBancaria.sacar(100);

    }
}
