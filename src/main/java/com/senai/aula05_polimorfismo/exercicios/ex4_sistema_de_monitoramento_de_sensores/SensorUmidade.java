package com.senai.aula05_polimorfismo.exercicios.ex4_sistema_de_monitoramento_de_sensores;

public class SensorUmidade extends Sensor{
    double umidade;

    public SensorUmidade(double bateria, String nome, double umidade) {
        super(bateria, nome);
        this.umidade = umidade;
    }

    @Override
    public void relatorio() {
        System.out.println("O Sensor de umidade com nome de: " + nome+ "\nE de bateria de: " + bateria + "mAh\nEstá medindo a umidade de: " + umidade + "%");

    }
}
