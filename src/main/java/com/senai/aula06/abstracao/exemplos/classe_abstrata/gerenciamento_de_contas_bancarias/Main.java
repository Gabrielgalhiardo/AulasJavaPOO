package com.senai.aula06.abstracao.exemplos.classe_abstrata.gerenciamento_de_contas_bancarias;

public class Main {
    public static void main(String[] args) {
        testeContas(new ContaCorrente("Gabriel",23552));
        testeContas(new ContaPoupanca("Eric", 234));
    }
    private static void testeContas(Conta conta){
        System.out.println("\n\n--------------------------Teste Conta-------------------------------\n");
        System.out.println("----------------------------Antes----------------------------------");
        conta.exibirSaldo();
        conta.aplicarTaxaMensal();
        System.out.println("----------------------------Depois--------------------------------");
        conta.exibirSaldo();
    }
}
