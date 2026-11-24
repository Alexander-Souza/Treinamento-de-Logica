package br.com.formiga.exercicio132;

/*Crie uma classe chamada Produto com os atributos nome, preco e quantidade.
Adicione um método para calcular o valor total do estoque (preco * quantidade) e outro
método para exibir os detalhes do produto. No método main(), crie dois objetos e teste os
métodos.*/
public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double totalEstoque(double preco, int quantidade) {
        return preco * quantidade;
    }

    public void detalheProduto() {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Valor do produto: " + preco);
        System.out.println("Quantidade do produto: " + quantidade);
        System.out.println("Valor total em estoque " + totalEstoque(preco, quantidade));
    }


}
