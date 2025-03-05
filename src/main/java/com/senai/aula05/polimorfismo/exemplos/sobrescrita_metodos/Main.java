package com.senai.aula05.polimorfismo.exemplos.sobrescrita_metodos;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cachorro();

        animal.fazerSom();

        animal = new Gato();


        animal.fazerSom();

        emitirSom(new Cachorro());
        emitirSom(new Gato());
        emitirSom(new Animal());

    }

    public static void emitirSom(Animal animal){
        animal.fazerSom();
    }


}
