package com.senai.aula05_polimorfismo.exercicios.ex5_sistema_de_beneficios_de_funcionarios;

public class PlanoDeSaude extends Beneficios{

    public PlanoDeSaude(String nome, double salario, double valorBeneficio) {
        super(nome, salario, valorBeneficio);
    }

    @Override
    public void descontoSalarial() {
        System.out.println("O valor do beneficio: Plano de Saude é de: " + valorBeneficio + " reais\nSendo assim iremos descontar: " + (salario*0.20) + "reais\nO seu salario após esse beneficio é de: " + (salario-salario*0.20));
    }
}
