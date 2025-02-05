package com.senai.Aula03_encapsulamento.exercicios.Exercicio03_GerenciamentoDeFuncionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
static List<Funcionario> listaDeFuncionarios = new ArrayList<>();
static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
    criarFuncionario();
    System.out.println(listaDeFuncionarios);
}

    public static void criarFuncionario(){
        String menu = "Qual cargo Voce deseja ser:\n" +
                "Digite 1 para Gerente\n" +
                "Digite 2 para Programador\n" +
                "Digite 3 para Analista";
        int opcaoUser;

        do {
            System.out.println(menu);
            opcaoUser = scanner.nextInt();
        }while (opcaoUser<0 || opcaoUser > 3);

        System.out.print("Digite o nome do funcionario: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o salario do" + nome + ":");
        double salario = scanner.nextDouble();
        Funcionario funcionario = new Funcionario(
                nome,
                salario,
                opcaoUser
        );
        listaDeFuncionarios.add(funcionario);
    }
}
