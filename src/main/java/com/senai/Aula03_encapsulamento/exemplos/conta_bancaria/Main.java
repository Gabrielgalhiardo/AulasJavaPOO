package com.senai.Aula03_encapsulamento.exemplos.conta_bancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContaBancaria contaBancaria1 = new ContaBancaria(
                192123,
                new Usuario(
                        "Gabriel",
                        33333333,
                        "09/08/2007"),
                77.7,
                "Brasilzinho",
                "conta de investimentos"
        );

        ContaBancaria contaBancaria2 = new ContaBancaria(
                13,
                new Usuario(
                        "Igor",
                        7655533,
                        "09/08/2007"),
                577.8,
                "Brasilzinho",
                "conta de investimentos"
        );

        System.out.println(contaBancaria1.getNumeroDaConta());
        System.out.println(contaBancaria1.getSaldo());


        System.out.print("Digite a quantidade que deseja sacar: RS:");
        double quantidadeSaque = scanner.nextDouble();

        contaBancaria1.sacar(quantidadeSaque);



        System.out.print("Digite a quantidade que deseja depositar: R$:");
        double quantidadeDeposito = scanner.nextDouble();

        contaBancaria1.depositar(quantidadeDeposito);



        System.out.print("Digite a quantidade que deseja transferir: RS:");
        quantidadeSaque = scanner.nextDouble();

        contaBancaria1.transferir(quantidadeSaque, contaBancaria2);

        System.out.println(contaBancaria1.getSaldo());


    }
}
