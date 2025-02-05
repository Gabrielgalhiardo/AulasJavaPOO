package com.senai.Aula03_encapsulamento.exercicios.Exercicio03_GerenciamentoDeFuncionarios;

import java.lang.reflect.Array;
import java.util.Objects;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;
    private String[] opcaoCargos = {"Gerente", "Programador", "Analista"};

    public Funcionario(String nome, double salario, int cargo) {
        if (nome.isEmpty()){
            System.out.println("Nome Invalido!");
        }else {
            this.nome = nome;
        }

        if (salario < 1320){
            System.out.println("Salario abaixo do padrao!");
        }else {
            this.salario = salario;
        }
        this.cargo =  this.opcaoCargos[cargo-1];
    }


    public String getNome() {
        String texto = "o nome do Funcionario é: " + nome;
        return texto;

    }

    public void setNome(String nome) {
        if (nome.isEmpty()){
            System.out.println("Nome invalido!");
        }else{
            this.nome = nome;
        }

    }

    public String getSalario() {
        String texto = "O salario do funcionario é de R$" + salario;
        return texto;
    }

    public void setSalario(double salario) {
        if (salario < 1320.00){
            System.out.println("O salario de R$" + salario + " é um salario abaixo do padrao!");
        }
        this.salario = salario;
    }

    public String getCargo() {
        String texto = "O Cargo do funcionario é: " + cargo;
        return texto;
    }

    public String[] getOpcaoCargos() {
        return opcaoCargos;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Double.compare(salario, that.salario) == 0 && Objects.equals(nome, that.nome) && Objects.equals(cargo, that.cargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, salario, cargo);
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
