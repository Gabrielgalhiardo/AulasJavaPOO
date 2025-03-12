package com.senai.aula06.abstracao.exemplos.interfaces.veiculos;

public interface Veiculo {
    void acelerar();

    default void buzinar(){
        System.out.println("Bii Bii Bii Bii");
    };
}
