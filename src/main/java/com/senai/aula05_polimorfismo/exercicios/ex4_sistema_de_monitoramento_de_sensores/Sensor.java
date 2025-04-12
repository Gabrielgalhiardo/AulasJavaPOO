package com.senai.aula05_polimorfismo.exercicios.ex4_sistema_de_monitoramento_de_sensores;

public abstract class Sensor {
    String nome;
    double bateria;

    public Sensor(double bateria, String nome) {
        this.bateria = bateria;
        this.nome = nome;
    }

    public abstract void relatorio();
}
