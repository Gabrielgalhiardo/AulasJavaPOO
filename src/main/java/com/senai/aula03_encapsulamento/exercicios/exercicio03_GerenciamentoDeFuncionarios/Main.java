package com.senai.aula03_encapsulamento.exercicios.exercicio03_GerenciamentoDeFuncionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
static List<Funcionario> listaDeFuncionarios = new ArrayList<>();
static Scanner scanner = new Scanner(System.in);
static int opcaoUser;

public static void main(String[] args) {
    menuPrincipal();
    scanner.close();
}

    public static  void menuPrincipal(){
        String menu = """
            Digite 1 para cadastrar um novo funcionario
            Digite 2 para mostrar a tabela dos funcionarios
            Digite 3 para aumentar o salario do funcionario
            Digite 4 para sair
            """;

        do {
            System.out.println(menu);
            opcaoUser = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoUser){
                case 1:
                    criarFuncionario();
                    break;

                case 2:
                    mostrarListaFuncionario();
                    break;

                case 3:
                    mostrarListaFuncionario();
                    System.out.println("Digite o Nome do funcionario que deseja alterar o salario:");
                    String nome = scanner.nextLine();
                    Funcionario funcionario = buscarFuncionarioPeloNome(nome);
                    if (funcionario ==null){
                        System.out.println("O funcionario digitado está errado");
                    }else {


                        int opcao = listaDeFuncionarios.indexOf(funcionario);

                        System.out.println("Digite o percentual que deseja aumentar do salario");
                        double percentual = scanner.nextInt();
                        scanner.nextLine();
                        if (percentual <0){
                            System.out.println("\nO percentual não pode ser negativo");
                        }else{
                            funcionario.aumentoSalario(percentual);
                            listaDeFuncionarios.set(opcao, funcionario);
                        }

                    }
                    break;

                case 4:
                    System.out.println("Saindo do programa!!");
                    break;
            }

        }while (opcaoUser !=4);
    }

    public  static Funcionario buscarFuncionarioPeloNome(String nome){

        return listaDeFuncionarios.stream().
                filter(funcionario -> funcionario.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }

    public static void criarFuncionario(){
        String menu = """
                Qual cargo Voce deseja ser:
                Digite 1 para Gerente
                Digite 2 para Programador
                Digite 3 para Analista""";


        do {
            System.out.println(menu);
            opcaoUser = scanner.nextInt();
            scanner.nextLine();
        }while (opcaoUser<0 || opcaoUser > 3);

        System.out.print("Digite o nome do funcionario: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o salario do " + nome + ":");
        double salario = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(
                nome,
                salario,
                opcaoUser
        );
        listaDeFuncionarios.add(funcionario);
    }

    public static void mostrarListaFuncionario(){
        for (Funcionario funcionario : listaDeFuncionarios ){
            System.out.println(funcionario);
        }
        System.out.println("\n");
    }
}
