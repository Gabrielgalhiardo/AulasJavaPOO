package com.senai.aula05_polimorfismo.exercicios.ex3_gestao_de_produtos;

public class ProdutoFisico extends Produto{


    public ProdutoFisico(String nome, long preco) {
        super(nome, preco);
    }

    @Override
    public void precoFinal() {
        System.out.println("O preço final do produto Fisico é de " + (preco + preco*0.3));
    }
}
