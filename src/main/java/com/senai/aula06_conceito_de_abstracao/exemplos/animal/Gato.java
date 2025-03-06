package com.senai.aula06_conceito_de_abstracao.exemplos.animal;

public class Gato extends Animal{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println(nome + " esta miando");
    }
}
