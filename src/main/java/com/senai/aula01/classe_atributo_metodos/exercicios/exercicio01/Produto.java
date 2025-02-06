package com.senai.aula01.classe_atributo_metodos.exercicios.exercicio01;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public void exibirdetalher() {
        System.out.println(toString());
    }

    public void atualizarEstoque(int quantidadeAtualizada) {

        quantidade += quantidadeAtualizada;
        System.out.println("A quantidade do estoque agora é: " + quantidade);

    }

    public void calcularValorEstoque() {
        double valorTotal = (preco * quantidade);
        System.out.println("O valor total do estoque de: " + nome + ".\nÈ de: R$" + valorTotal);
    }
}
