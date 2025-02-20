package com.senai.aula04.Herenca.exercicios.exercicio03_sistema_de_gestao_de_pedidos;

public class PedidoOnline extends Pedido{
    private double taxaDeEntrega;


    public PedidoOnline(int numeroDoPedido, double valorTotal, String estiloPedido, double taxaDeEntrega) {
        super(numeroDoPedido, valorTotal, estiloPedido);
        this.taxaDeEntrega = taxaDeEntrega;
    }

    public double getTaxaDeEntrega() {
        return taxaDeEntrega;
    }

    public void setTaxaDeEntrega(double taxaDeEntrega) {
        this.taxaDeEntrega = taxaDeEntrega;
    }
}
