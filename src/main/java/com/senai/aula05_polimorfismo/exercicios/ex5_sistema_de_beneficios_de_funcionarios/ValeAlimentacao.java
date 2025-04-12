package com.senai.aula05_polimorfismo.exercicios.ex5_sistema_de_beneficios_de_funcionarios;

public class ValeAlimentacao extends Beneficios{

    public ValeAlimentacao(String nome, double salario, double valorBeneficio) {
        super(nome, salario, valorBeneficio);
    }

    @Override
    public void descontoSalarial() {
        System.out.println("O valor do beneficio: Vale alimentação é de: " + valorBeneficio + " reais\nSendo assim iremos descontar: " + (salario*0.12) + "reais\nO seu salario após esse beneficio é de: " + (salario-salario*0.12));

    }
}
