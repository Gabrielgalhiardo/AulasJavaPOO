package com.senai.aula03_encapsulamento.exercicios.exercicio01_CadastroDeProdutosSimples;

public class Produto {

    private String nome;
    private  double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0){
            this.preco = preco;
        }else{
            System.out.println("O numero não pode ser negativo");
        }

    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

}
