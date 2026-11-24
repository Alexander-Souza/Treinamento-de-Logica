package br.com.formiga.ita.imc;

/*Implemente no Eclipse uma classe chamada Paciente que possui um construtor
que recebe o seu peso em quilos e sua altura em metros, ambos utilizando o tipo
double. Crie um método chamado calcularIMC() que calcula o índice de
Massa Corporal de acordo com a
fórmula IMC = peso (quilos) / (altura * altura (metros)).
Crie também um método chamado diagnostico() que utiliza o
método calcularIMC() e retorna uma String de acordo com as seguintes faixas de
   valor:*/
public class Paciente {
    private double peso;
    private double altura;

    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public String diagnostico() {

        double imc = calcularIMC(this.peso, this.altura);

        if (imc < 16) {
            return "Baixo peso muito grave";
        } else if (imc >= 16 && imc < 16.99) {
            return "Baixo peso grave";
        } else if (imc >= 17 && imc < 18.49) {
            return "Baixo peso";
        } else if (imc >= 18.50 && imc < 24.99) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.99) {
            return "Sobrepeso";
        }else if (imc >= 30 && imc < 34.99) {
            return "Obesidade grau 1";
        }else if (imc >= 35 && imc < 39.99) {
            return "Obesidade grau 2";
        }
        return "Obesidade grau III (obesidade mórbida)";
    }
}
