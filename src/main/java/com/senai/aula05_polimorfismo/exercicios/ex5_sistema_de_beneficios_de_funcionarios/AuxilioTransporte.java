package com.senai.aula05_polimorfismo.exercicios.ex5_sistema_de_beneficios_de_funcionarios;

public class AuxilioTransporte extends Beneficios{

    public AuxilioTransporte(String nome, double salario, double valorBeneficio) {
        super(nome, salario, valorBeneficio);
    }

    @Override
    public void descontoSalarial() {
        System.out.println("O valor do beneficio: Auxilio Transporte é de: " + valorBeneficio + " reais\nSendo assim iremos descontar: " + (salario*0.06) + "reais\nO seu salario após esse beneficio é de: " + (salario-salario*0.06));
    }


}
