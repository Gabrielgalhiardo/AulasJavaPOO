package com.senai.aula04.Herenca.exercicios.exercicio02_sistema_de_funcionario;

public class Funcionarios {
    private String nome;
    private double salario;

    public Funcionarios(double salario, String nome) {
        this.salario = salario;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
