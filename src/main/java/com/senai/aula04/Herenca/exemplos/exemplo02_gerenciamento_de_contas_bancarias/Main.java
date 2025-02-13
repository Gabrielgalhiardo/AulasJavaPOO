package com.senai.aula04.Herenca.exemplos.exemplo02_gerenciamento_de_contas_bancarias;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(
                "Gabriel",
                2132,
                23
        );

        ContaPoupanca contaPoupanca = new ContaPoupanca(
                "Gustavo",
                222,
                0.2
        );
        System.out.println(contaPoupanca.getSaldo());
        ;
        contaPoupanca.aplicarRendimento();

        System.out.println(contaPoupanca.getSaldo());
    }



}
