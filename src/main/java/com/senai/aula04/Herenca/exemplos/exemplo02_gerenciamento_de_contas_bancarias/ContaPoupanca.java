package com.senai.aula04.Herenca.exemplos.exemplo02_gerenciamento_de_contas_bancarias;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldp, double taxaRendimento) {
        super(titular, saldp);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento(){
        super.setSaldo(getSaldo() + (getSaldo() * taxaRendimento));
    }
}
