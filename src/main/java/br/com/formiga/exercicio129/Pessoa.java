package br.com.formiga.exercicio129;
/*: Crie uma classe chamada Pessoa com os atributos nome e idade. Adicione um
método chamado apresentar() que exiba no console: "Olá, meu nome é [nome] e tenho
[idade] anos". No método main(), crie dois objetos Pessoa e chame o método apresentar()
para ambos.*/
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprimir(){
        System.out.println("Olá o meu nome é "+this.nome+" é tenho a "+this.idade+" anos.");
    }
}
