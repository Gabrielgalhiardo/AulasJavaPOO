package com.senai.aula03.encapsulamento.exemplos.conta_bancaria;

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
        System.out.println("Saldo: o cliente " + this.usuario.getNome() + " tem saldo de R$:" + saldo);
        return saldo;
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

    public void sacar(double quantidadeSaque) {

        if (saldo  - quantidadeSaque >= 0 && quantidadeSaque >= 0){
            System.out.println("Saque: R$:" +quantidadeSaque + "\nUsuario: " + this.usuario.getNome());
            System.out.println("\nSaldo após a transção: " + saldo);
        }
        System.out.println("Voce nâo possue saldo suficiente para sacar: " + quantidadeSaque);

    }

    public void depositar(double quantidadeDeposito) {
        if(quantidadeDeposito > 0){
            saldo += quantidadeDeposito;
            System.out.println("Deposito: valor de R$:" + quantidadeDeposito + "\nFoi depositado na conta do usuario: " + this.usuario.getNome());
            System.out.println("Saldo depois da translação: R$:" + saldo);
            return;
        }
        System.out.println("Quantidade do valor do deposito é abaixo do minino");
    }

    public void transferir(double valorTransferencia, ContaBancaria contaDestino){
        System.out.println("Transferencia:\n ");
        this.sacar(valorTransferencia);
        contaDestino.depositar(valorTransferencia);

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
