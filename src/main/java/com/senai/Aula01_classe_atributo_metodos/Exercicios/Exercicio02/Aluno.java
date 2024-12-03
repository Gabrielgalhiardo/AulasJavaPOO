package com.senai.Aula01_classe_atributo_metodos.Exercicios.Exercicio02;

import java.util.Scanner;

public class Aluno {
    String nome;
    int idade;
    float nota;

    public Aluno(String nome, int idade, float nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nota=" + nota +
                '}';
    }

    public void exibirInformacoes() {
        System.out.println(toString());
    }

    public void atualizarNota() {
        Scanner scanner = new Scanner(System.in);
        float novaNota;
        System.out.println("Digite a nova nota que você quer atualizar do aluno: " + nome);
        novaNota = scanner.nextFloat();
        nota = novaNota;
        scanner.close();
    }

    public boolean verificarAprovacao(float nota) {
        boolean passou;
        return passou = nota >= 6F;
    }
}

