package com.senai.aula05_polimorfismo.exercicios.ex4_sistema_de_monitoramento_de_sensores;

import java.sql.SQLOutput;

public class SensorTemperatura extends Sensor{
    double temperatura;

    public SensorTemperatura(double bateria, String nome, double temperatura) {
        super(bateria, nome);
        this.temperatura = temperatura;
    }

    @Override
    public void relatorio() {
        System.out.println("O Sensor de temperatura com nome de: " + nome+ "\nE de bateria de: " + bateria + "mAh\nEstá medindo a temperatura de: " + temperatura + "Cº");
    }
}
