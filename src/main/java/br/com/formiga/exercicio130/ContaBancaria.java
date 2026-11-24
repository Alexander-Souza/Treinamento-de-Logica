package br.com.formiga.exercicio130;
/*Implemente uma classe chamada ContaBancaria com os atributos
numeroConta e saldo. Crie um construtor que inicialize esses atributos ao criar um objeto.
No método main(), crie uma conta bancária usando o construtor.*/

/*Adicione à classe ContaBancaria os métodos depositar(double valor) e
sacar(double valor), que atualizam o saldo da conta. No método main(), simule um depósito
e um saque, e exiba o saldo após cada operação.*/
public class ContaBancaria {

    private String numeroConta;
    private double saldo;
    private double valor;

    public ContaBancaria(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.valor = valor;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (valor <= saldo){
            this.saldo -= valor;
        }else {
            System.out.println("Saldo Insulficiente.");
        }

    }

    public void imprimir(){
        System.out.println("O numero da conta é: "+this.numeroConta);
        System.out.println("O meu saldo é: "+this.saldo);
    }
}
