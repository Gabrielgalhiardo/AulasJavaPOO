package com.senai.aula04.Herenca.exemplos.exemplo02_gerenciamento_de_contas_bancarias;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldp) {
        this.saldo = saldp;
    }

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

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", saldp=" + saldo +
                '}';
    }
}
