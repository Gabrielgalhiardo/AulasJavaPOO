package com.senai.aula02_colecoes_em_java.exercicio02_Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Produto> produtoLista = new ArrayList<>();

    public static void main(String[] args) {
        menuPrincipal();
        scanner.close();
    }

    public static void menuPrincipal() {
        String menu = """
                ______________________________________
                | 1. Cadastrar Produto               |
                | 2. Listar Produtos                 |
                | 3. Atualizar Quantidade            |
                | 4. Remover produto                 |
                | 5. Buscar produto                  |
                | 6. Sair                            |
                |____________________________________|
                """;
        int opcaoUser;
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
                    atualizarEstoque();
                    break;
                case 4:
                    removerProduto();
                    break;
                case 5:
                    buscarProduto();
                    break;
                case 6:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (opcaoUser != 6);
    }

    public static void cadastrarProduto() {
        System.out.println("Digite o nome do produto que deseja cadastrar");
        String nomeDoProduto = scanner.nextLine();
        System.out.println("Digite a quantidade do produto: " + nomeDoProduto + " pasa colocar no estoque");
        int qtnDoEstoque = scanner.nextInt();
        scanner.nextLine();
        produtoLista.add(new Produto(nomeDoProduto, qtnDoEstoque));
    }

    public static void listarProdutos() {
        for (Produto produto : produtoLista) {
            System.out.println((produtoLista.indexOf(produto) + 1) + " - " + produto);

        }
    }

    public static void atualizarEstoque() {
        listarProdutos();
        System.out.println("Digite o nome do produto que deseja atualizar: ");
        String nomeProduto = scanner.nextLine();
        System.out.println("Digite a a quantidade para atualizar o produto: " + nomeProduto);
        int qntParaAtualizar = scanner.nextInt();
        scanner.nextLine();

        int id = 0;
        for (Produto produto: produtoLista){
            if(produtoLista.equals(nomeProduto)){
                id = produtoLista.indexOf(produto);
            }
        }
        produtoLista.get(id).qntEmEstoque = qntParaAtualizar;
        System.out.println("O seu produto: " + nomeProduto + ", foi atualizado!");

    }

    public static void removerProduto() {
        listarProdutos();
        System.out.println("Digite o nome do produto que deseja remover: ");
        String nomeProduto = scanner.nextLine();
        int id = 0;
        for (Produto produto: produtoLista){
            if(produtoLista.equals(nomeProduto)){
                id = produtoLista.indexOf(produto);
            }
        }
        produtoLista.remove(id);
        System.out.println("O seu produto: " + nomeProduto + ", foi removido!");
    }

    public static void buscarProduto() {
        System.out.println("Digite o nome do produto que deseja buscar: ");
        String nomeProduto = scanner.nextLine();
        int id = 0;
        for (Produto produto: produtoLista){
            if(produtoLista.equals(nomeProduto)){
                id = produtoLista.indexOf(produto);
            }
        }
        System.out.println(produtoLista.get(id));


    }
}
