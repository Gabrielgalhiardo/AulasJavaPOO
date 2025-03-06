package com.senai.aula02_colecoes_em_java.exercicio01_tarefa;

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