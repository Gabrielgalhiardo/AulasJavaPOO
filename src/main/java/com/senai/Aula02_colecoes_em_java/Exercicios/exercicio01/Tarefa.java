package com.senai.Aula02_colecoes_em_java.Exercicios.exercicio01;

public class Tarefa {
    String tarefa;
    boolean statusDeConclusão;

    @Override
    public String toString() {
        return String.format("%s - [%s]", tarefa,statusDeConclusão ?"Concluida":"Pendente");
        }

    public Tarefa(String tarefa, boolean statusDeConclusão) {
        this.tarefa = tarefa;
        this.statusDeConclusão = statusDeConclusão;


    }
}