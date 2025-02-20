package com.senai.aula04.Herenca.exercicios.exercicio01_controle_de_estoque;

public class Alimento extends Produto{
    private String dataDeValidade;

    public Alimento(String produto, double preco, int quantidade, String dataDeValidade) {
        super(produto, preco, quantidade);
        this.dataDeValidade = dataDeValidade;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString() {

        return super.toString() + "\nData de validade: " + dataDeValidade;
    }
}
