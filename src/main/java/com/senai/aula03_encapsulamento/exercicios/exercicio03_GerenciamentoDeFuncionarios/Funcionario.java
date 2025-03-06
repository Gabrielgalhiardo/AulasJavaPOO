package com.senai.aula03_encapsulamento.exercicios.exercicio03_GerenciamentoDeFuncionarios;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;
    private String[] opcaoCargos = {"Gerente", "Programador", "Analista"};

    public Funcionario(String nome, double salario, int cargo) {
        setNome(nome);
        setSalario(salario);

        this.cargo =  this.opcaoCargos[cargo-1];
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty()){
            System.out.println("Nome invalido!");
        }else{
            this.nome = nome;
        }

    }

    public void setSalario(double salario) {
        if (salario < 1320.00){
            System.out.println("O salario de R$" + salario + " é um salario abaixo do padrao!\nMudando o salario para 1320");
            this.salario = 1320;
        }else {
            this.salario = salario;
        }

    }

    public String getCargo() {
        return "O Cargo do funcionario é: " + cargo;
    }

    public String[] getOpcaoCargos() {
        return opcaoCargos;
    }

    public String aumentoSalario(double percentualDoAumento){
        this.salario += salario * (percentualDoAumento /100);

        return "O salario com o persentual atualizado é de: " + this.salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                '}';
    }

}
