package com.senai.aula05_polimorfismo.exercicios.ex3_gestao_de_produtos;

public class ProdutoServico extends Produto{


    public ProdutoServico(String nome, long preco) {
        super(nome, preco);
    }

    @Override
    public void precoFinal() {
        System.out.println("O preço final do produto Serviço é de " + (preco + preco*0.5));
    }
}
