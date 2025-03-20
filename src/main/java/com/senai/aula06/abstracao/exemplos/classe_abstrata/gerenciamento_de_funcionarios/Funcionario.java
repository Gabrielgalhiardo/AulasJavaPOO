package com.senai.aula06.abstracao.exemplos.classe_abstrata.gerenciamento_de_funcionarios;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double percentualAumento){
        salario += salario*percentualAumento/100;
    }

    public abstract void calcularBonus();

    public void exibirDados(){
        System.out.printf("%s recebe R$%,.2f\n", nome,salario);
    }

}
