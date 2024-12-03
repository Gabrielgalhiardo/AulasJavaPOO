package com.senai.Aula01_classe_atributo_metodos.Exercicios.Exercicio01;

import com.senai.Aula01_classe_atributo_metodos.Exercicios.Exercicio02.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(
                "Lingua de boi",
                23.2,
                4
        );
        Produto produto2 = new Produto(
                "água",
                4.70,
                20
        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade para atualizar o estoque do produto: " + produto1.nome);
        int quantidadeAtualizada = scanner.nextInt();
        scanner.nextLine();
        produto1.atualizarEstoque(quantidadeAtualizada);
        scanner.close();


        produto1.exibirdetalher();
        produto2.exibirdetalher();
        produto1.calcularValorEstoque();
        produto2.calcularValorEstoque();
    }
}
