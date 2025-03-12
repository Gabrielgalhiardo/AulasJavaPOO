package com.senai.aula06.abstracao.exemplos.classe_abstrata.classe_abstrata_animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(
                "tobias"
        );

        Gato gato = new Gato(
                "Tomas"
        );

        emitirSom(cachorro);
        emitirSom(gato);

        List<Animal> listaAnimal = new ArrayList<>();
        listaAnimal.add(cachorro);
        listaAnimal.add(gato);

        listaAnimal.forEach( Animal::dormir);
        listaAnimal.forEach(System.out::println);


    }

    public static void  emitirSom(Animal animal){
        animal.fazerSom();
    }
}
