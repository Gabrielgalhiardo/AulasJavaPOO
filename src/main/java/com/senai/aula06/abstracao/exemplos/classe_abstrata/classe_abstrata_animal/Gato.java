package com.senai.aula06.abstracao.exemplos.classe_abstrata.classe_abstrata_animal;

public class Gato extends Animal{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println(nome + " esta miando");
    }
}
