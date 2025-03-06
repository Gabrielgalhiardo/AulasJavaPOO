package com.senai.aula04_heranca.exercicios.exercicio03_sistema_de_gestao_de_pedidos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int opcaoUser;
    static List<Pedido> listaDePedidos = new ArrayList<>();

    public static void main(String[] args) {
        String menu = """
                ______________________________________
                | 1. Cadastrar pedido                |
                | 2. Listar todos pedidos            |
                | 3. Para Sair                       |
                |____________________________________|
                """;
        do {
            System.out.println(menu);
            opcaoUser = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoUser) {
                case 1:
                    cadastrarPedido();
                    break;
                case 2:
                    listarTodosOsPedidos();
                    break;
                case 3:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (opcaoUser != 3);
        scanner.close();
    }

    public static void cadastrarPedido(){
        String estiloPedido = "";
        do {
            System.out.println("Digite o metodo que deseja pedir:\nDigite 1 para online\nDigite 2 para presencial");
            opcaoUser = scanner.nextInt();
            scanner.nextLine();
            switch (opcaoUser) {
                case 1:
                    estiloPedido = "Online";
                    break;
                case 2:
                    estiloPedido = "Presencial";
                    break;
                default:
                    System.out.println("Digite um opção válida");
            }
        }while (!(opcaoUser > 0 && opcaoUser <= 2));

        System.out.print("Digite o numero do pedido: ");
        int numeroDoPedido = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o valor do pedido: ");
        double valorTotal = scanner.nextDouble();

        if (estiloPedido.equals("Online")){
            System.out.print("Digite a taxa do entregador: ");
            double taxaDeEntrega = scanner.nextDouble();

            Pedido pedidoOnline = new PedidoOnline(
                    numeroDoPedido,
                    valorTotal,
                    estiloPedido,
                    taxaDeEntrega
            );
            listaDePedidos.add(pedidoOnline);
        }else{
            System.out.println("Digite o desconto A vista");
            double descontoAvista = scanner.nextDouble();

            Pedido pedidoPresencial = new PedidoPresencial(
                    numeroDoPedido,
                    valorTotal,
                    estiloPedido,
                    descontoAvista
            );
            listaDePedidos.add(pedidoPresencial);
        }

    }

    public static void listarTodosOsPedidos(){
        for (int pedidos = 0; pedidos < listaDePedidos.size(); pedidos++) {
            System.out.println(pedidos+1+ "°\n" + listaDePedidos.get(pedidos) + "\n---------------------------------------------------");
        }
    }
}
