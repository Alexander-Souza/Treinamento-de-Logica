package br.com.formiga.exercicio128;

public class AppCarro {
    static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.setMarca("Fiat");
        carro1.setModelo("Uno");
        carro1.setAno(2008);

        System.out.println(carro1);

        carro2.setMarca("Volkswagen");
        carro2.setModelo("Gol");
        carro2.setAno(2024);

        System.out.println(carro2);


    }
}
