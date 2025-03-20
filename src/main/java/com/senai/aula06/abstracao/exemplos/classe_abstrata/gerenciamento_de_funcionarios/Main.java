package com.senai.aula06.abstracao.exemplos.classe_abstrata.gerenciamento_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        testeFuncionarios(
                new FuncionarioEfetivo(
                "Gabriel",
                12234,
                5322
        )
    );

        testeFuncionarios(
                new FuncionarioTemporario(
                "Igor",
                300,
                10,
                1000
        )
    );
    }
    private static void testeFuncionarios(Funcionario funcionario){
        funcionario.exibirDados();
        funcionario.aumentarSalario(10);
        funcionario.exibirDados();
        funcionario.calcularBonus();
        funcionario.exibirDados();
    }
}
