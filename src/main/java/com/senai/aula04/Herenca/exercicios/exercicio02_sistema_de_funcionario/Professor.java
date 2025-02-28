package com.senai.aula04.Herenca.exercicios.exercicio02_sistema_de_funcionario;

public class Professor extends Funcionarios {
    private String diciplna;

    public Professor(String nome, double salario, String diciplna) {
        super(nome, salario);
        this.diciplna = diciplna;
    }

    public String getDiciplna() {
        return diciplna;
    }

    public void setDiciplna(String diciplna) {
        this.diciplna = diciplna;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "diciplna='" + diciplna + '\'' +
                '}';
    }
}
