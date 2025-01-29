package com.senai.Aula03_encapsulamento.exemplos.conta_bancaria;

public class Usuario {
    private String nome;
    private int cpf;
    private String dataDeNascimento;

    public Usuario(String nome, int cpf, String dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                '}';
    }

}
