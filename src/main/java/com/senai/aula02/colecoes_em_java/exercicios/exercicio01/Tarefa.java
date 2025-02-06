package com.senai.aula02.colecoes_em_java.exercicios.exercicio01;

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