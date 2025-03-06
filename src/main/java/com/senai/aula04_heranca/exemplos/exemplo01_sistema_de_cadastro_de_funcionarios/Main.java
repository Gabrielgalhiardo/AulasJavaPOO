package com.senai.aula04_heranca.exemplos.exemplo01_sistema_de_cadastro_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(
                "Igor",
                3000
        );
        Funcionario gerente1 = new Gerente(
                "Gabriel",
                15930,
                3534
        );

        funcionario1.exibirDados();
        gerente1.exibirDados();
    }
}
