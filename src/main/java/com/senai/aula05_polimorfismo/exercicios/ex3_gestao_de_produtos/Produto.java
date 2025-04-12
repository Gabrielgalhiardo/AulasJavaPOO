package com.senai.aula05_polimorfismo.exercicios.ex3_gestao_de_produtos;

public abstract class Produto {
    String nome;
    long preco;

    public Produto(String nome, long preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public abstract void precoFinal();
}
