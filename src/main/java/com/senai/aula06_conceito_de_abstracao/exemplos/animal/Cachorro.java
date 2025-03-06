package com.senai.aula06_conceito_de_abstracao.exemplos.animal;

public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println(nome + " esta latindo");
    }
}
