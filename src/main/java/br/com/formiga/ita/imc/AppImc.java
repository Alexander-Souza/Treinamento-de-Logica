package br.com.formiga.ita.imc;

public class AppImc {
    static void main(String[] args) {
        Paciente paciente1 = new Paciente(90, 1.50);

        paciente1.calcularIMC(paciente1.getPeso(), paciente1.getAltura());
        System.out.println(paciente1.diagnostico());
    }
}
