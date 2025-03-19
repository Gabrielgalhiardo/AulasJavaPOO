package com.senai.aula06.abstracao.exemplos.classe_abstrata.gerenciamento_de_contas_bancarias;

public class ContaCorrente extends Conta{

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    void aplicarTaxaMensal() {
        saldo -= 2000;
    }
}
