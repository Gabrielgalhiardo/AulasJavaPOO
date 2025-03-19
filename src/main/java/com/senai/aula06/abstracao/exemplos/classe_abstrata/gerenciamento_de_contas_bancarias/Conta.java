package com.senai.aula06.abstracao.exemplos.classe_abstrata.gerenciamento_de_contas_bancarias;

public abstract class Conta {
    private String titular;
    protected double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    abstract void aplicarTaxaMensal();

    public void depositar(double valor){
        saldo+= valor;
    }

    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }

    public void exibirSaldo(){
        System.out.println("Titular: " + titular + ", Saldo R$" + saldo);
    }

}
