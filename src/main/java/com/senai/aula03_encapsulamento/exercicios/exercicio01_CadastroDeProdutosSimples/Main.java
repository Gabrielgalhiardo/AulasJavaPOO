package com.senai.aula03_encapsulamento.exercicios.exercicio01_CadastroDeProdutosSimples;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto(
          "farinha",
          213.3
        );
        System.out.println("valores atuais");
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());

        System.out.println("\nvalores atualizados");
        produto.setNome("banana");
        System.out.println(produto.getNome());

        produto.setPreco(0);
        System.out.println(produto.getPreco());

    }
}
