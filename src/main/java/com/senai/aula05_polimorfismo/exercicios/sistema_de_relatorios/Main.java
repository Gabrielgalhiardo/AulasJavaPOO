package com.senai.aula05_polimorfismo.exercicios.sistema_de_relatorios;

public class Main {
    public static void main(String[] args) {
        CSV csv = new CSV();
        JSON json = new JSON();
        PDF pdf = new PDF();

        csv.gerar();
        json.gerar();
        pdf.gerar();
    }
}
