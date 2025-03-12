package com.senai.aula06.abstracao.exemplos.classe_abstrata.classe_abstrata_animal;

public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println(nome + " esta latindo");
    }
}
