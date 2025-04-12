package com.senai.aula05_polimorfismo.exercicios.ex4_sistema_de_monitoramento_de_sensores;

public class Main {
    public static void main(String[] args) {
        testarClasses(new SensorTemperatura(324.3, "Temperatura Sala", 34.3));
        testarClasses(new SensorUmidade(2134.6, "Umidade São Paulo", 44.8));
    }
    public static void testarClasses(Sensor sensor){
        System.out.println("--------------------------------------------");
        sensor.relatorio();
    }
}
