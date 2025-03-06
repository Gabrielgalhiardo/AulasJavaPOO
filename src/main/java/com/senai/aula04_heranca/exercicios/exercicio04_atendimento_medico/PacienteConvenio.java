package com.senai.aula04_heranca.exercicios.exercicio04_atendimento_medico;

public class PacienteConvenio extends Paciente{
    private int desconto;

    public PacienteConvenio(String nome, int idade, int desconto) {
        super(nome, idade);
        this.desconto = desconto;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }


    @Override
    public String toString() {

        return super.toString() + "desconto= " + desconto+"}";
    }
}
