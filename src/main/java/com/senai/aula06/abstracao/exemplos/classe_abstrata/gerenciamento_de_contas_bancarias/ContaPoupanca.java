package com.senai.aula06.abstracao.exemplos.classe_abstrata.gerenciamento_de_contas_bancarias;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    void aplicarTaxaMensal() {
        saldo += saldo*0.05;
    }
}
