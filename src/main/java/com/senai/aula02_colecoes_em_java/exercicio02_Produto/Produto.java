package com.senai.aula02_colecoes_em_java.exercicio02_Produto;

import java.util.Objects;

public class Produto {
        String nomeDoProduto;
        int qntEmEstoque;

    @Override
    public String toString() {
        return "O produto: " + nomeDoProduto +" | Tem um estoque de: " + qntEmEstoque;
    }

    public Produto(String nomeDoProduto, int qntEmEstoque) {
        this.nomeDoProduto = nomeDoProduto;
        this.qntEmEstoque = qntEmEstoque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nomeDoProduto, produto.nomeDoProduto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nomeDoProduto);
    }
}
