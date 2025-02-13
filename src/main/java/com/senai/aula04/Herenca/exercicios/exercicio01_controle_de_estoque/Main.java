package com.senai.aula04.Herenca.exercicios.exercicio01_controle_de_estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int opcaoUser;
    static List<Produto> listarProdutos = new ArrayList<>();

    public static void main(String[] args) {

        String menu = """
                ______________________________________
                | 1. Cadastrar Produto               |
                | 2. Listar Produtos                 |
                | 3. Para Sair                       |
                |____________________________________|
                """;
        do {
            System.out.println(menu);
            opcaoUser = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoUser) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (opcaoUser != 3);
        scanner.close();






    }

    public static void cadastrarProduto(){
        do {
            System.out.println("Digite o tipo de produto que deseja cadastrar\nDigite 1 para Alimentos \nDigite 2 para Eletronicos");
            opcaoUser = scanner.nextInt();
            scanner.nextLine();
        }while (!(opcaoUser > 0 && opcaoUser <= 3));

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o preço do produto: R$");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade do produto:");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        if (opcaoUser == 1){
            System.out.print("Digite a data de validade do produto:");
            String validade = scanner.nextLine();
            Produto alimento = new Alimento(
                    nomeProduto,
                    preco,
                    quantidade,
                    validade
            );
            listarProdutos.add(alimento);
        }else{

            int voltagem  = 110;

            do {
                System.out.println("Digite a voltagem do produto:\nDigite 1 para 110\nDigite 2 para 220");
                opcaoUser = scanner.nextInt();
                scanner.nextLine();
                switch (opcaoUser) {
                    case 1:
                        voltagem = 110;
                        break;
                    case 2:
                        voltagem = 220;
                        break;
                    default:
                        System.out.println("Opção invalida!");
                }
            }while (!(opcaoUser > 0 && opcaoUser <= 3));


            Produto eletronico = new Eletronico(
                    nomeProduto,
                    preco,
                    quantidade,
                    voltagem
            );
            listarProdutos.add(eletronico);
        }
    }

    public static void listarProdutos(){
        for (Produto produto : listarProdutos){
            System.out.println((listarProdutos.indexOf(produto) + 1 ) + " - \n" + produto) ;
        }
    }
}
