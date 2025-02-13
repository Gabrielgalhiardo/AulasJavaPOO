package com.senai.aula04.Herenca.exemplos.exemplo_veiculos;

public class Main {
    public static void main(String[] args) {

        Veiculo carro = new Carro(
                "yaris",
                2022,
                4
        );

        Veiculo moto = new Moto(
                "landhover",
                2023,
                true
        );


        carro.exibirDetalhes();
        System.out.println("\n");
        moto.exibirDetalhes();
    }
}
