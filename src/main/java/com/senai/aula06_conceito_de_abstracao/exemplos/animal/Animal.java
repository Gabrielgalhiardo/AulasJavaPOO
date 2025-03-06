package com.senai.aula06_conceito_de_abstracao.exemplos.animal;

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
