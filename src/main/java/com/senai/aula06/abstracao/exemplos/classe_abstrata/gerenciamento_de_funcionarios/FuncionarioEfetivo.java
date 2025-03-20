package com.senai.aula06.abstracao.exemplos.classe_abstrata.gerenciamento_de_funcionarios;

public class FuncionarioEfetivo extends Funcionario{
    private double bonusMensal;

    public FuncionarioEfetivo(String nome, double salario, double bonusMensal) {
        super(nome, salario);
        this.bonusMensal = bonusMensal;
    }

    @Override
    public void calcularBonus() {
        salario += bonusMensal;
    }
}
