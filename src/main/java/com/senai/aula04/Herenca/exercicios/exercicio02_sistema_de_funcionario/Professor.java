package com.senai.aula04.Herenca.exercicios.exercicio02_sistema_de_funcionario;

public class Professor extends Funcionarios {
    private String diciplna;

    public Professor(double salario, String nome, String diciplna) {
        super(salario, nome);
        this.diciplna = diciplna;
    }

    public String getDiciplna() {
        return diciplna;
    }

    public void setDiciplna(String diciplna) {
        this.diciplna = diciplna;
    }
}
