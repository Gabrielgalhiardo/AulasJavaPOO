package com.senai.Aula03_encapsulamento.exemplos.conta_bancaria;

public class ContaBancaria {

    private int numeroDaConta;
    private Usuario usuario;
    private double saldo;
    private String banco;
    private String tipos;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public ContaBancaria(int numeroDaConta, Usuario usuario, double saldo, String banco, String tipos) {
        this.numeroDaConta = numeroDaConta;
        this.usuario = usuario;
        this.saldo = saldo;
        this.banco = banco;
        this.tipos = tipos;
    }

    public double sacar(){
        return 0.0;
    }

    public void depositar(double valor){

    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroDaConta=" + numeroDaConta +
                ", usuario=" + usuario +
                ", saldo=" + saldo +
                ", banco='" + banco + '\'' +
                ", tipos='" + tipos + '\'' +
                '}';
    }

}
