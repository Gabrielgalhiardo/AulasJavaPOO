package com.senai.aula06.abstracao.exemplos.classe_abstrata.classe_abstrata_animal;

abstract class Animal {
    String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    void dormir(){
        System.out.println(nome + " está dormindo");
    }

    abstract void fazerSom();

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
