package com.senai.aula04_heranca.exercicios.exercicio01_controle_de_estoque;

public class Eletronico extends Produto {
    private int voltagem;

    public Eletronico(String produto, double preco, int quantidade, int voltagem) {
        super(produto, preco, quantidade);
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public String toString() {

        return super.toString() + "\nVoltagem: " + voltagem;
    }
}
