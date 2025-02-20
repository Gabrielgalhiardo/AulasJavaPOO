package com.senai.aula04.Herenca.exercicios.exercicio04_atendimento_medico;

public class PacienteParticular extends Paciente{
    private double custoConsulta;

    public PacienteParticular(String nome, int idade, double custaConsulta) {
        super(nome, idade);
        this.custoConsulta = custaConsulta;
    }

    public double getCustoConsulta() {
        return custoConsulta;
    }

    public void setCustoConsulta(double custoConsulta) {
        this.custoConsulta = custoConsulta;
    }

    @Override
    public String toString() {
        return super.toString() + "Custo da consulta= " + custoConsulta+"}";
    }
}
