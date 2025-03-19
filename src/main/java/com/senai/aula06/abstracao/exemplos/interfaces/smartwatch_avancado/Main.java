package com.senai.aula06.abstracao.exemplos.interfaces.smartwatch_avancado;

public class Main {
    public static void main(String[] args) {
        SmartwatchAvancado smartwatchAvancado = new SmartwatchAvancado();
        smartwatchAvancado.medirFrequenciaCardiaca();
        smartwatchAvancado.contarPassos();
        smartwatchAvancado.medirQualidadeSono();
    }
}
