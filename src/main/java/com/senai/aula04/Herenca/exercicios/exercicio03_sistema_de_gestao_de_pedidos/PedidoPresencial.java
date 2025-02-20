package com.senai.aula04.Herenca.exercicios.exercicio03_sistema_de_gestao_de_pedidos;

public class PedidoPresencial extends Pedido{
    private double descontoAvista;

    public PedidoPresencial(int numeroDoPedido, double valorTotal, String estiloPedido, double descontoAvista) {
        super(numeroDoPedido, valorTotal, estiloPedido);
        this.descontoAvista = descontoAvista;
    }

    public double getDescontoAvista() {
        return descontoAvista;
    }

    public void setDescontoAvista(double descontoAvista) {
        this.descontoAvista = descontoAvista;
    }
}
