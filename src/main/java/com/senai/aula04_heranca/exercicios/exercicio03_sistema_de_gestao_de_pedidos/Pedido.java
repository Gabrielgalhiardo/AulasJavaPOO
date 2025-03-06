package com.senai.aula04_heranca.exercicios.exercicio03_sistema_de_gestao_de_pedidos;

public class Pedido {
    private int numeroDoPedido;
    private double valorTotal;
    private String estiloPedido;



    public Pedido(int numeroDoPedido, double valorTotal, String estiloPedido) {
        this.numeroDoPedido = numeroDoPedido;
        this.valorTotal = valorTotal;
        this.estiloPedido = estiloPedido;
    }

    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setNumeroDoPedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getEstiloPedido() {
        return estiloPedido;
    }

    public void setEstiloPedido(String estiloPedido) {
        this.estiloPedido = estiloPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numeroDoPedido=" + numeroDoPedido +
                ", valorTotal=" + valorTotal +
                ", estiloPedido='" + estiloPedido + '\'' +
                '}';
    }
}

