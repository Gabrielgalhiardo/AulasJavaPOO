package com.senai.Aula03_encapsulamento.exemplos.conta_bancaria;

public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario(
                "Gabriel",
                33333333,
                "09/08/2007"
        );

        ContaBancaria contaBancaria1 = new ContaBancaria(
   192123,
                usuario1,
                77.7,
                "Brasilzinho",
                "conta de investimentos"
        );

        System.out.println(contaBancaria1);

    }
}
