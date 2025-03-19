package com.senai.aula06.abstracao.exemplos.interfaces.smartwatch_avancado;

public class SmartwatchAvancado implements SensorCardiaco, SensorPassos, SensorSono{

    @Override
    public void medirFrequenciaCardiaca() {
        System.out.println("Medição cardiaca: 94bpm");
    }

    @Override
    public void contarPassos() {
        System.out.println("Passos hoje: 12000");

    }

    @Override
    public void medirQualidadeSono() {
        System.out.println("Qualidade do sono: dormiu perfeitamente");
    }

    void exibirDispositivos(){
        System.out.println("Smartwatch conectado aos dispositivos:.......");
    }
}

