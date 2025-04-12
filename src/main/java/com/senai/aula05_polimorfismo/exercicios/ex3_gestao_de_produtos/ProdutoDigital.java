package com.senai.aula05_polimorfismo.exercicios.ex3_gestao_de_produtos;

public class ProdutoDigital extends Produto{

    public ProdutoDigital(String nome, long preco) {
        super(nome, preco);
    }

    @Override
    public void precoFinal() {
        System.out.println("O preço final do produto Digital é de " + (preco + preco*0.1));
    }
}
