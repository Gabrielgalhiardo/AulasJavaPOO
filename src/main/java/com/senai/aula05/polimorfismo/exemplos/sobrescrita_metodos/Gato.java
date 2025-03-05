package com.senai.aula05.polimorfismo.exemplos.sobrescrita_metodos;

public class Gato extends Animal{
    @Override
    void fazerSom() {
        System.out.println("O gato mia! miau miau miau miau");
    }
}
