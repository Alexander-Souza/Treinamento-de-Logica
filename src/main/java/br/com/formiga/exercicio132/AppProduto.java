package br.com.formiga.exercicio132;

import java.util.Scanner;

public class AppProduto {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produto produto1 = new Produto();

        System.out.println("Digite o nome do produto: ");
        produto1.setNome(input.nextLine());
        System.out.println("Digite o valor do produto: ");
        produto1.setPreco(input.nextDouble());
        System.out.println("Digite a quantidade do produto");
        produto1.setQuantidade(input.nextInt());

        produto1.detalheProduto();
    }


}
