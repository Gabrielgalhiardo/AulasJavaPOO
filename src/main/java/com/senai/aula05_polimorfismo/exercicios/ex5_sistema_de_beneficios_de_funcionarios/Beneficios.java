package com.senai.aula05_polimorfismo.exercicios.ex5_sistema_de_beneficios_de_funcionarios;

public abstract class Beneficios {
    String nome;
    double salario;
    double valorBeneficio;

    public Beneficios(String nome, double salario, double valorBeneficio) {
        this.nome = nome;
        this.salario = salario;
        this.valorBeneficio = valorBeneficio;
    }

    public abstract void descontoSalarial();

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getValorBeneficio() {
        return valorBeneficio;
    }
}
